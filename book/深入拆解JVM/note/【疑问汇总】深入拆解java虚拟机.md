【疑问汇总】深入拆解 Java 虚拟机
=======

## 第2讲

> 如果你熟悉 X86 的话，你会发现这和段式内存管理中的代码段类似。而且，Java 虚拟机同样也在内存中划分出堆和栈来存储运行时数据。

- 什么是段式内存管理？


- 在 Java 中，正无穷和负无穷是有确切的值，在内存中分别等同于十六进制整数 0x7F800000 和 0xFF800000。了解一下这两个无穷数的具体含义？

- JVM 加载基本类型时，除了 long 和 double 占用 2 个字节，其他基本类型(如 boolean、byte、char)都转成 int 类型表示，查看一下 深入JVM的说明？

## 03 | Java虚拟机是如何加载Java类的?

- 温习一下双亲委派的机制(父加载器不能做，子加载器才做，也就是说，子类加载器不能简单覆盖父加载器)

- jdk 中的几个基本的 3 个类加载器没有找到？这几个类加载器除了 bootstrapClassloder 是由 C++ 实现的，另外两个的实现在什么地方？具体是如何实现的？

```
在 Java 虚拟机中，类的唯一性是由类加载器实例以及类的全名一同确定的。即便是同一串字节流，经由不同的类加载器加载，也会得到两个不同的类。在大型应用中，我们往往借助这一特性，来运行同一个类的不同版本。
```
- 这个特性运行同一个类的不同版本，是如何使用的？


## 第 讲


## 工具篇

- 对于 ASM 如何使用不理解？

> 查阅资料去了解用法


## 第 14 讲

- 阅读几篇博客加深理解锁

- 什么是 CAS ?

## 第 20 讲

- 寄存器，如 rax 寄存器， eax 寄存器，这些寄存器都是做什么的？不了解寄存器

## 第 28 讲
> ?
> 
> @yx 避免 B2 中的字段与MyBenchmark类、MyBenchmark_jmhType类中的字段（或内存里下一个对象中的字段）会出现在同一缓存行中,同一缓存行有什么问题？为什么可以避免？

## 第 33 讲

这一节看完很生疏，java agent 和字节码注入有什么具体的应用场景？为什么要出现这种技术？具体在工程实践中该如何使用呢？