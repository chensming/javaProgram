

public class CalendarMainClass {
    public static void main(String args[]) {
        CalendarFrame frame = new CalendarFrame();
        frame.setBounds(100, 100, 360, 300);
        frame.setVisible(true);
        frame.validate();
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
                                    public void windowClosing(java.awt.event.WindowEvent e) {
                                        System.exit(0);
                                    }
                                }
        );
    }
}


/*��дһ��Ӧ�ó�����һ�����ڣ��ô���ΪBorderLayout���֡�
���ڵ��������һ��Panel������pCenter��pCenter�Ĳ�����7��7�е�GriderLayout���֣�
pCenter�з���49����ǩ��������ʾ���������ڵı������һ��Panel����pNorth���䲼����FlowLayout���֣�
pNorth����������ť��nextMonth��previousMonth������nextMonth��ť��������ʾ��ǰ�µ���һ�µ�������
����previousMonth��ť��������ʾ��ǰ�µ���һ�µ����������ڵ��������һ��Panel����pSouth��
�䲼����FlowLayout���֣�pSouth�з���һ����ǩ������ʾһЩ��Ϣ��
 */