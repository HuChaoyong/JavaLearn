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



