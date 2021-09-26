# springboot在junit中如何mock某个方法

## 1 需求场景

在springboot的测试用例中，我们常常遇到某些方法需要mock，比如调用第三方服务。当服务需要配置复杂的环境，而我们只需要关心它的返回数据，这时我们往往只需简单的mock该服务即可。

## 2 常见使用问题

* 使用`@Mock`注解，无法做到*只mock部分代码*，它要么全部mock，要么mock不起作用。

## 3 解决方案

使用`@TestConfiguration`来自定义需要mock的对象，如下代码(`springboot+junit5`)：

[MyTest](_media/MyTest.java ':include :type=code')

## 4 参考资料

[spring-boot-integration-testing-with-mocked-services-components](https://stackoverflow.com/questions/42641853/spring-boot-integration-testing-with-mocked-services-components)