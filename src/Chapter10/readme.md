# 泛型的讲解

## 泛型类的定义
```
[访问权限] class 类名 <泛型类型标识1, 泛型类型标识2...> {
    [访问权限] 泛型类型标识 变量名;
    [访问控制] 泛型类型标识  方法名() {};
    [访问控制] 返回类型声明 方法名 (泛型类型标识 变量名) {};
} 
```
## 泛型对象的定义
```
类名称<具体类>  对象名 = new 类名称<具体类>();
```

## 泛型的上下限限制
表示泛型只能是 Number的子类或者Number
```
class Info <T extends Number> {...}
```

表示泛型只能是 String的父类或者 String
```
class Info <T super String> {...}
```
## 泛型与子类继承的限制
>在类声明中, Object类可以接收 String,
但是,在泛型中
>Info\<Object> 却不能接收 Info\<String>


## 定义泛型接口
```
[访问权限] interface 接口名 <泛型标识> {...}
interface Info <T> {...}
```

## 定义泛型方法
```
[访问权限] <泛型标识> 泛型标识方法名称 ([泛型标识  参数名称])
public <T> T fun(T t) {return t;}
```