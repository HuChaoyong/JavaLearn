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

