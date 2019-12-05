import java.util.Scanner;

public class Scanner{
    public static void main(String args[]){
        System.out.println("请输入若干单词，以空格作为分隔");
        Scanner in = new Scanner(System.in);
        while(!in.hasNext("#")){
            System.outprintln("键盘输入的内容是 " + in.next());
        }
        System.out.println("执行完");
    }
}