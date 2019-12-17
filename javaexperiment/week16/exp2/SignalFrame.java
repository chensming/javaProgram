

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SignalFrame extends Frame implements ItemListener {
    Choice choice;
    SignalCanvas signal = null;
    String itemRed = "���", itemYellow = "�Ƶ�", itemGreen = "�̵�";

    public SignalFrame() {
        choice = new Choice();  //������1������choice
        choice.add(itemRed);    //������2������choice���itemRed
        choice.add(itemYellow); //������3������choice���itemYellow
        choice.add(itemGreen);  //������4������choice���itemGreen
        choice.addItemListener(this);  //����ǰ����ע��Ϊchoice��ItemEvent�¼�������
        add(choice, BorderLayout.NORTH);
        signal = new SignalCanvas();
//        try {
//            Class cs = Class.forName("SignalCanvas");
//            signal = (SignalCanvas) cs.newInstance();
        add(signal, BorderLayout.CENTER);
//        } catch (Exception e) {
//        add(new Label("����û�б�дSignalCanvas��"), BorderLayout.CENTER);
//        }
        setBounds(100, 100, 360, 300);
        setVisible(true);
        validate();
        addWindowListener(new WindowAdapter() {
                              public void windowClosing(WindowEvent e) {
                                  System.exit(0);
                              }
                          }
        );
    }

    public void itemStateChanged(ItemEvent e) {
        String item = choice.getSelectedItem();  // choice���ر�ѡ�е���Ŀ
        int w = signal.getBounds().width;
        int h = signal.getBounds().height;
        int m = Math.min(w, h);
        signal.setRadius(m / 6);
        if (item.equals(itemRed)) {
            if (signal != null) {
                signal.setRed(1);
                signal.setYellow(0);
                signal.setGreen(0);
                signal.setPosition(w / 3, 0);
                signal.repaint();
            }
        } else if (item.equals(itemYellow)) {
            if (signal != null) {
                signal.setRed(0);
                signal.setYellow(1);
                signal.setGreen(0);
                signal.setPosition(w / 3, h / 3);
                signal.repaint();
            }
        } else if (item.equals(itemGreen)) {
            if (signal != null) {
                signal.setRed(0);
                signal.setYellow(0);
                signal.setGreen(1);
                signal.setPosition(w / 3, 2 * h / 3);
                signal.repaint();
            }
        }
    }
}