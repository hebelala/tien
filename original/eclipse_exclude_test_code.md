# How to exclude test code on eclipse

## Problem

使用Eclipse，当我们使用springboot启动一个application时，如果在test包下也创建了service的实现类，那么可能会出现问题：运行时，使用了test包下的类。

## Solution

在运行配置的`Classpath`里，勾选`Exclude test code`即可，如下图：

![exclude_test_code](_media/exclude_test_code.png ':size=80%')

## Thinking

为什么Eclipse*默认*不是`Exclude test code`呢？ 迷惑~

## Reference

[how-avoid-eclipse-load-test-class-file-in-to-classpath-when-java-app-run](https://stackoverflow.com/questions/47549803/how-avoid-eclipse-load-test-class-file-in-to-classpath-when-java-app-run)