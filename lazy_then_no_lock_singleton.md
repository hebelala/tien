# 1 回顾单例
我们了解到单例写法，关注点一般有：是否懒加载、是否有锁、是否需要判空。  
现在我们关注的都是懒加载的写法。主流的有两种写法，分别利用锁和类加载机制。

## 1.1 利用锁的写法
优点：不必依赖类加载机制，完全由自己掌控。  
缺点：即使已经初始化实例，仍然需要判空。  

[SingletonWithLock](_media/SingletonWithLock.java ':include :type=code')

## 1.2 利用类加载机制的写法
优点：无需判空。  
缺点：依赖类加载机制，无法完全由自己决定什么时候加载实例，比如有第三方包实现了热加载功能。

[SingletonWithNoLock](_media/SingletonWithNoLock.java ':include :type=code')

# 2 今天讨论的单例
我是看Curator源码时发现的，就这个类[HandleHolder](https://github.com/apache/curator/blob/curator-2.0.0/curator-client/src/main/java/org/apache/curator/HandleHolder.java)。   
借鉴它的思维，修复它的空指针问题，我的代码：

[Me.java](_media/Me.java ':include :type=code')

优点：懒加载，用锁来做到用一条线程来实例化，后续的获取实例是无锁、不需要判空的。

思维：在实例化后，既然不需要锁和判空，那就重写这个方法，直接返回实例。

<font color="red">任何东西都可被替代。爱情，往事，记忆，失望，时间……都可以被替代。但是你不能无力自拔。 </font>  
<div style="text-align: right">----安妮宝贝《彼岸花》</div>

# 3 来听听田小姐 :hearts:
[原来你是我最想留住的幸运](_media/IMG_0330.mp4 ':include')
