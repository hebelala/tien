# Batch Remove Redis Data

## 场景和要求

* 数据量大
* 删除高性能
* 不影响Redis服务

## 方案

* 要删除数据，我们首先得知道有哪些key
* 不能使用[KEYS](https://redis.io/commands/keys)命令，它会影响Redis服务
* 使用[SCAN](https://redis.io/commands/scan)命令，而spring-data-redis是不支持cluster下的SCAN命令的，因此我们需要获取原生JedisClient对每个Redis结点执行SCAN命令。
* 删除时，不能用[DEL](https://redis.io/commands/del)，因为它是同步命令，会影响Redis服务
* 也不能用[UNLINK](https://redis.io/commands/unlink)，因为在使用spring-data-redis在cluster下执行批量命令时是单线程一个一个执行的，效率极低，已经给社区提[issue](https://github.com/spring-projects/spring-data-redis/issues/2166)
* 我们可以使用[EXPIRE with a non-positive timeout](https://redis.io/commands/expire)，来达到DEL的目的，并且使用pipeline的方式来提升性能。
