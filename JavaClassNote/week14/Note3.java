package out;//��class�ļ������out�ļ�����

import java.util.*;
 
public class Note3{
 public static void main(String[] args) {
     List<String> list=new ArrayList<String>();
     list.add("Hello");
     list.add("World");
     list.add("HAHAHAHA");
     //��һ�ֱ�������ʹ�� For-Each ���� List
     //Ҳ���Ը�д for(int i=0;i<list.size();i++) ������ʽ
     for (String str : list) {            
        System.out.println(str);
     }
 
     //�ڶ��ֱ������������Ϊ������ص����ݽ��б���
     String[] strArray=new String[list.size()];
     list.toArray(strArray);
    //����Ҳ���Ը�дΪ  for(String str:strArray) ������ʽ
     for(int i=0;i<strArray.length;i++) 
     {
        System.out.println(strArray[i]);
     }
     
    //�����ֱ��� ʹ�õ�����������ر���
     
     Iterator<String> ite=list.iterator();
     while(ite.hasNext())//�ж���һ��Ԫ��֮����ֵ
     {
         System.out.println(ite.next());
     }
 }
}
