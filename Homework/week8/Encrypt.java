import java.util.Scanner;
import java.io.*;

public class Encrypt{
    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("������ҪҪ���м��ܵ��ļ���(��xxx.txt)");
        String primary = in.nextLine();
        System.out.println("������Ҫ������ܺ���ļ���(��yyy.txt)");
        String after = in.nextLine();
        Reader reader = new FileReader(primary);
        FileWriter fw = new FileWriter(after);
        int n;
        try{
            while((n = reader.read()) != -1){
                fw.write((char)(n + 3));
            }
        } catch(IOException e) {
            System.out.println("�����ļ������г��� " + e.toString());
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch(IOException e) {
                    System.out.println("�ر���Դ�ļ������г��� " + e.toString());
                }
            }
            if(fw != null){
                try{
                    fw.close();
                }catch(IOException e){
                    System.out.println("�رռ��ܺ��ļ������г��� " + e.toString());          
                }
            }
        }
    }
}