import java.util.Scanner;

public class J_Input{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input your name:");
        String name = scanner.nextLine();
        System.out.print("Input your age:");
        int age = scanner.nextInt();
        System.out.println("Name is:"+name+",and the age is "+age);
    }
}