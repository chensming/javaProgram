//������
import java.io.*;
import java.util.Scanner;

public class CopyFile {
	static StringBuffer delComm(String s) {
		int index = s.indexOf("//");
		StringBuffer sBuffer = new StringBuffer(s);
		if(index != -1) {
			sBuffer.delete(index, s.length());
		}
		return sBuffer;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������Ҫ��ȡ���ļ�");
		String readPathName = in.nextLine();
		System.out.println("��������Ҫ������ļ�");
		String writePathName = in.nextLine();
		try (FileReader reader = new FileReader(readPathName);
				BufferedReader br = new BufferedReader(reader) // ����һ�����������ļ�����ת�ɼ�����ܶ���������
				) {
			try (FileWriter writer = new FileWriter(writePathName);
					BufferedWriter out = new BufferedWriter(writer)
					) {
				//				out.write("�һ�д���ļ���1\r\n"); // \r\n��Ϊ����
				//				out.write("�һ�д���ļ���2\r\n"); // \r\n��Ϊ����
				String line;
				StringBuffer delLine;
				
				while ((line = br.readLine()) != null) {
					// һ�ζ���һ������
					delLine = delComm(line);
					if(delLine != null && delLine.length() != 0) {
						//���ڲ���
                        // System.out.println(delLine);
						out.write(delLine + "\n");
					}	
				}
				out.flush(); // �ѻ���������ѹ���ļ�
                System.out.println("read and save successfully!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		in.close();
	}
}