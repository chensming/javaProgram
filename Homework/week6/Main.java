import java.util.Scanner;
import java.lang.Math;

abstract class GeometricObject{
    protected String color;
    protected Boolean IsFill;//�Ƿ����
};

class Triangle extends GeometricObject{
    Scanner in = new Scanner(System.in);
    private double a,b,c;
    Triangle(){
        System.out.println("�����������εı߳�");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        while(a + b < c || a + c < b || b + c < a)
        {
            System.out.println("���߲�����������");
            System.out.println("���������������εı߳�");
            // System.exit(1); �����˳����򷽷� ������Ϊ0���������˳�
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
        }  
        System.out.println("�����������ε���ɫ,��blue����ɫ"); 
        color = in.next();
        System.out.println("�������Ƿ����,true/false");
        String str = in.next();
        IsFill = Boolean.parseBoolean(str);
    }

    public void showSide(){
        System.out.println("���߷ֱ��� " + a + " " + b + " " + c );
    }

    public void showColor(){
        System.out.println("��ɫ�� " + color);
    }

    public void showIsFill(){
        System.out.println("��䣿" + IsFill);
    }

    public void showPerimeter(){
        System.out.println("�ܳ�: " + (a + b + c));
    }

    public void showArea(){
        double s = (a + b + c) / 2;
        System.out.println("���: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    

};

public class Main{
    public static void main(String args[]){
        Triangle a = new Triangle();
        a.showSide();
        a.showPerimeter();
        a.showArea();
        a.showColor();
        a.showIsFill();
    }
}
