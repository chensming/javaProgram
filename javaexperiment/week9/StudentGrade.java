//������
import java.io.*;
//import java.util.StringTokenizer;


public class StudentGrade {
	public static void main(String args[]) {
		//ѧ������
		final int STUDENTNUM = 30;
		String input = "D:/Desktop/vscodeProject/javaProject/javaLab/week9/otherFiles/ingrade.txt";
		String output = "D:/Desktop/vscodeProject/javaProject/javaLab/week9/otherFiles/outgrade.txt";
		try (FileReader reader = new FileReader(input);
				BufferedReader br = new BufferedReader(reader)
				){
			try(FileWriter writer = new FileWriter(output);
					BufferedWriter bw = new BufferedWriter(writer)
					){
				int i = 0;
				String[] names = new String[30];
				double[] scores = new double[30];
				String line;
				while((line = br.readLine()) != null) {
					String [] arr = line.split("\\s+");
					names[i] = arr[0];
					scores[i] = Double.parseDouble(arr[1]);
					i++;
					//����
//					System.out.print(i + ", name: " + arr[0]);
//					System.out.println(" ,score: " + arr[1]);
				}
				
				double maxScore = scores[0];
				double minScore = scores[0];
				double averageScore = scores[0];
				String maxScoreStudent = names[0];
				String minScoreStudent = names[0];
				for(i = 1; i < 30 ; i++) {
					if(maxScore < scores[i]) {
						maxScore = scores[i];
						maxScoreStudent = names[i];
					}
					if(minScore > scores[i]) {
						minScore = scores[i];
						minScoreStudent = names[i];
					}
					averageScore += scores[i];
				}
				averageScore /= STUDENTNUM;
				bw.write("��߷�: " + maxScore + ",ѧ������: " + maxScoreStudent);
				bw.write("\n��ͷ�: " + minScore + ",ѧ������: " + minScoreStudent);
				bw.write("\nƽ����: " + averageScore);
				
				//����
//				System.out.println("��߷�: " + maxScore + ",ѧ������: " + maxScoreStudent);
//				System.out.println("��ͷ�: " + minScore + ",ѧ������: " + minScoreStudent);
//				System.out.println("ƽ����: " + averageScore);
				System.out.println("run and save to file successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
