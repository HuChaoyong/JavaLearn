# 1.本章讲解的是Java中的多线程

实现方法一:
. 继承 Thread 类
    Q: 为什么不直接调用 run(); 而要调用 start(); 来启动线程 ?
    A: 线程的运行需要本机操作系统支持
    在 start()函数体中, ,使用的是某个 native 关键字申明的另一个方法. 就以为这需要系统支持.
    此关键字表示调用本机的操作系统函数,因为多线程需要操作系统的支持.


实现方法二:
.实现 Runnable 接口
Runnable中定义了一个 run() 函数

调用时, 还是要使用 Thread类,
例如:  Thread t1 = new Thread(new MyThread("实现了Runnable接口的实例"));


区别:
    继承 Thread类不适合做共享.
    而,实现 Runnable接口适合做共享.



Q:  Java 程序每次运行时,至少会启动几个线程,
A:  2个,   一个是 main线程, 一个是垃圾收集线程.


线程优先级有3个常亮

Thread.MIN_PRIORITY  => 1

Thread.NORM_PRIORITY => 5

Thread.MAX_PRIORITY => 10

优先级   : 只能反映 线程 的 中或者是 紧急程度 , 不能决定 是否一定先执行!!!
还得看 CPU爸爸调用哪个

主方法默认的是 NORM_PRIORITY



多个线程共享同一资源一定要进行同步  synchronized , 以保证资源操作的完整性
但是!!! 过多的的同步有可能造成死锁.
