class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("name: " + getName());
        System.out.println("age: " + getAge());
    }
}

//Ϊ�˷����պ�ϰ,�����Ͳ�дΪTestClass��
public class Ex4{
    public static void main(String args[]){
        Person p = new Person("xiao bin", 20);
        p.display();
    }
}