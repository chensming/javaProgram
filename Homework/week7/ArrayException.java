import java.util.Random;
import java.util.Scanner;

public class ArrayException{
    public static void main(String args[]){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int numbers[] = new int[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = rand.nextInt();
        }
        try{
            System.out.println("��������Ҫ���ʵ��±�");
            int num = in.nextInt();
            System.out.println(numbers[num]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("OutofBounds");
        }
    }  
}