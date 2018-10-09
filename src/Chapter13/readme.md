# Java 类集

## 常用类集
* Collection 是存放一组单值的最大接口
* List 是 Collection的子接口， 进行了扩充，内容允许重复
* Set 是Collection的子类，没有扩充，不允许存放重复值
* Map 是存放一对值的最大接口， 对值 => 键值对
* Iterator 集合的输出接口，用于输出集合中的内容，只能进行从前到后的单向输出
* ListIterator 是 Iterator的子接口，可以进行双向输出 
* Enumeration  用于输出指定集合中的内容
* SortedSet 单值的排序接口，实现此接口的集合类，里面的内容可以使用比较器排序
* SortedMap 存放键值对的排序接口，实现后，里面的内容可以按照 key排序，使用比较器排序
* Queue  对列接口，可以实现对列操作
* Map.Entry 是 Map.Entry的内部接口，每个 Map.Entry对象都保存这一对键值对的内容，每个Map接口中都保存有多个Map.Entry接口实例

关系如图
![avator](./relation.png)


- 标识
* List可以存放重复内容
* Set 不能存放重复内容,所有重复的内容考 hashCode() 和 equals()方法区分
* Queue 对列接口
* SortedSet 可以对集合中的数据进行排序

 ## List
 add, add(index, object),remove(index),remove(object),isEmpty(),indexOf()
 ## Vector
 两者的区别：
 * ArrayList 采用异步处理，性能高， 但属于非线程安全, 只能用 Iterator, foreach输出
 * Vector 采用同步处理，性能较低，但线程安全， 可以用 Iterator，foreach，Enumeration输出
 * <b>一般用ArrayList<b>
 
 ## LinkedList 链表操作类
 
 ## TreeSet
 
 > 开发中，一个完整的类最好覆写Object的 hashCode(), equals(), toString()
 
 ## 集合的输出
 * Iterator  迭代输出， 最常用 (思维： 只要遇到了集合输出，就一定要用Iterator接口)
 * ListIterator    用于输出List中的内容
 * Enumeration    旧接口,和 Iterator类似
 * foreach   遍历
 
 