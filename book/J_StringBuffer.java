public class J_StringBuffer{
    public static void main(String args[]){
        StringBuffer b = new StringBuffer("0123");
        System.out.println("�ַ������������ַ�����Ϊ\"" + b + "\"");
        System.out.println("�ַ����������ĳ�����" + b.length());
        System.out.println("�ַ�����������������" + b.capacity());

        b.ensureCapacity(25);
        System.out.println();
        System.out.println("�ڵ���\"b.ensureCapacity(25)\"֮��");
        System.out.println("�ַ������������ַ�����Ϊ\""+ b +"\"");
        System.out.println("�ַ����������ĳ�����"+b.length());
        System.out.println("�ַ�����������������"+b.capacity());
    }
}