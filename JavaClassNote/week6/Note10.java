//int,Integer��String��ת��

public class Note10{
    public static void main(String args[]){
        int i = 1000;
        //intתΪInterger
        Integer num1 = new Integer(i);
        Integer num2 = Integer.valueOf(i);
        Integer num3 = Integer.valueOf("100");
        //IntergerתΪint
        int c1 = num1.intValue();
        int c2 = Integer.parseInt("200");
        //IntergerתΪString
        String str1 = num1.toString();
    }
}