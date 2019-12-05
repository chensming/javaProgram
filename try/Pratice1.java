import java.util.Scanner;

public class Pratice1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = scanner.nextLine();
        System.out.println("Input your age: ");
        int age = scanner.nextInt();
        System.out.println("Name is "+ name + ",and the age is "
            + age);
    }
}