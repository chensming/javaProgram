package out;//讲class文件输出到out文件夹下

import java.util.*;
 
public class Note3{
 public static void main(String[] args) {
     List<String> list=new ArrayList<String>();
     list.add("Hello");
     list.add("World");
     list.add("HAHAHAHA");
     //第一种遍历方法使用 For-Each 遍历 List
     //也可以改写 for(int i=0;i<list.size();i++) 这种形式
     for (String str : list) {            
        System.out.println(str);
     }
 
     //第二种遍历，把链表变为数组相关的内容进行遍历
     String[] strArray=new String[list.size()];
     list.toArray(strArray);
    //这里也可以改写为  for(String str:strArray) 这种形式
     for(int i=0;i<strArray.length;i++) 
     {
        System.out.println(strArray[i]);
     }
     
    //第三种遍历 使用迭代器进行相关遍历
     
     Iterator<String> ite=list.iterator();
     while(ite.hasNext())//判断下一个元素之后有值
     {
         System.out.println(ite.next());
     }
 }
}
