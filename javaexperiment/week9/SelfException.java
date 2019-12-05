//�ڶ���
import java.util.Scanner;

class NumberRangeException extends Exception{
	private static final long serialVersionUID = 1L;
	public NumberRangeException(String msg){
		super(msg);
	}
}

public class SelfException{

	public  static  int selfExceptionTest(int int1,int int2) throws NumberRangeException{
		if( int1 < 10 || int1 > 20 || int2 < 10 || int2 > 20){
			throw new NumberRangeException("��������" + int1 + " �� " + int2 + " ,���������������10~20֮��");
			//            throw new NumberRangeException(null);
		}
		int result = int1 + int2;
		return result;
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("��������������");
		int a = in.nextInt();
		int b = in.nextInt();
		try{
			selfExceptionTest(a, b);
		} catch (NumberRangeException e){
			System.out.println(e.getMessage());
			//            System.out.println(e.toString());
		}
	}
}