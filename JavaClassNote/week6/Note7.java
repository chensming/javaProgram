public class Note7{
    public static void main(String args[]){
        StringBuilder str = new StringBuilder(1024);
        for(int i = 0; i < 1000; i++){
            str.append(String.valueOf(i) + " ");
            //����жϼӻ���ֻ��Ϊ������ÿ�
            if(i % 50 == 0 && i != 0)
                str.append("\n");
        }
        String s = str.toString();
        System.out.println(s);
    }
}