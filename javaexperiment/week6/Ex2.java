class Student{
    private String sNo;
    private String sName;
    private char sSex;
    private int sAge;
    private float sJava;

    Student(String sNo, String sName, char sSex, int sAge, float sJava){
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public String getNo() {
        return sNo;
    }

    public String getName(){
        return sName;
    }

    public char getSex(){
        return sSex;
    }

    public int getAge(){
        return sAge;
    }

    public float getJava(){
        return sJava;
    }
}

public class Ex2{
    public static void main(String args[]){
        Student s = new Student("20191010","Wang Lin",'Ů',22,100);
        System.out.println("ѧ��: " + s.getNo());
        System.out.println("����: " + s.getName());
        System.out.println("�Ա�: " + s.getSex());
        System.out.println("����: " + s.getAge());
        System.out.println("java�ɼ�: " + s.getJava());          
    }
}