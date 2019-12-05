class Person{
    private String name = "NULL";
    private int age = 20;

    Person(){

    }

    Person(String name){
        this.name = name;
    }

    Person(int age){
        this.age = age;
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    Person(int age,String name){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    } 

    public void setAge(int age){
        this.age = age;
    }
}

public class Main{
    public static void main(String args[]){
        Person alice = new Person(90);
        alice.setName("Alice");
        // alice.setAge(10);

        System.out.println(alice.getName());
        System.out.println(alice.getAge());
    }
}