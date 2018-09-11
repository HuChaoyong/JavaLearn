# 第十一章 Java常用类库

## StringBuffer类
>如果一字符串要经常改变,则需要用 StringBuffer类, 并且,不能用 + 连接,只能用 append

## Runtime 类
<b>Runtime可以运行pc中的程序, 比如:</b>
*Runtime.getRuntime().exec("/usr/bin/teamviewer");
*Runtime.getRuntime().exec("notepad.exe");

## 国际化
如果有多种国际化文件使用,优先级是 
*   Message_zh_CN.class > Message_zh_CN.properties > Message.properties

## System类
*  获取系统的一些信息
*   获取系统运行时间

## Date相关
*   获取各个日期属性的值
*   Date对象的本地化
*   日期格式的转换 SimpleDateFormat 类

## BigInteger 和 BigDecimal 类
* 用来处理大数字和大数字带小数

## Random 类
* 随机数类

## 对象的克隆
* 实现 Cloneable接口

## 数组排序和比较
* Comparable接口

## Regular Expression
* 正则： Pattern 和 Matcher
* String类中默认支持 replaceAll()、split() 和 matches()

## Time 和 TimerTask类
* 完成系统的定时操作 （定时器）