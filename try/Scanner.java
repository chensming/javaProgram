import java.util.Scanner;

public class Scanner{
    public static void main(String args[]){
        System.out.println("���������ɵ��ʣ��Կո���Ϊ�ָ�");
        Scanner in = new Scanner(System.in);
        while(!in.hasNext("#")){
            System.outprintln("��������������� " + in.next());
        }
        System.out.println("ִ����");
    }
}