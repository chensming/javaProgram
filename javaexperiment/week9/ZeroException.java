//������
import java.util.StringTokenizer;
import java.util.Scanner;

class NumberException extends Exception{
	private static final long serialVersionUID = 1L;
	public NumberException(String msg){
		super(msg);
	}
}

abstract class Graphics{
	public double area(){ return 0.0;}
}


//������
class Square extends Graphics{
	private double a;
	public Square(double a){
		this.a = a;
	}
	public double area(){
		return a * a;
	}
}

//������
class Rectangle extends Graphics{
	private double a;
	private double b;
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double area(){
		return a * b;
	}
}

//������
class Triangle extends Graphics{
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double area(){
		double s = (a + b + c) / 2;
			return Math.sqrt(a * (s - a) * (s - b) * (s - c));	
	}
}


public class ZeroException{
	@SuppressWarnings("resource")
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("������һ�в���");
		String str = in.nextLine();
		StringTokenizer st = new StringTokenizer(str);

		double []a = new double[4];
		// System.out.println("----- ͨ���ո�ָ� ");
		int i = 0;
		while (st.hasMoreElements()) {
			//            System.out.println(st.nextElement());
			i = i + 1;
			a[i] = Double.parseDouble((String) st.nextElement()) ;
		}
		System.out.println("�����ĸ���: " + i);



		try {
			if(i == 0) {
				throw new NumberException("����Ĳ�������Ϊ��");
			}
			else if(i == 1) {
				//			double a = Double.parseDouble(str);
				Square s = new Square(a[1]);
				System.out.println("�����ε����: " + s.area());
			}
			else if(i == 2) {
				Rectangle r = new Rectangle(a[1], a[2]);
				System.out.println("�����ε����: " + r.area());
			}
			else if(i == 3) {
				if( a[1] + a[2] <= a[3] || a[1] + a[3] <= a[2] || a[2] + a[3] <= a[1]) {
					System.out.println("�ⲻ��һ��������");
					System.exit(1);
				}
				Triangle t = new Triangle(a[1], a[2], a[3]);
				System.out.println("�����ε����: " + t.area());
			}
			else {
				System.out.println("����Ĳ���̫��");
			}

		} catch (NumberException e) {
			System.out.println(e.getMessage());
		}

		in.close();
	}
}