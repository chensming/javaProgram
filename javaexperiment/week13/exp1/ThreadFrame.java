//package javaLab.exp1;

import java.awt.*;
import java.awt.event.*;

public class ThreadFrame extends Frame implements ActionListener {
    Label  wordLabel;
    Button button;
    TextField inputText,scoreText;
    ////////////////////////////////////////////

    WordThread giveWord;
    //������2��//��WordThread����һ��giveWord����
    int score=0;
    ThreadFrame()
    { wordLabel=new Label(" ",Label.CENTER);
        wordLabel.setFont(new Font("",Font.BOLD,72));
        button=new Button("��ʼ");
        inputText=new TextField(3);
        scoreText=new TextField(5);
        scoreText.setEditable(false);
        ////////////////////////////////


        giveWord = new WordThread(wordLabel);
        //������3��//����giveWord����wordLabel���ݸ�WordThread���췽���Ĳ���
        button.addActionListener(this);
        inputText.addActionListener(this);
        add(button,BorderLayout.NORTH);
        add(wordLabel,BorderLayout.CENTER);
        Panel southP=new Panel();
        southP.add(new Label("�����ǩ����ʾ�ĺ��ֺ�س�:"));
        southP.add(inputText);
        southP.add(scoreText);
        add(southP,BorderLayout.SOUTH);
        setBounds(100,100,350,180);
        setVisible(true);
        validate();
        addWindowListener(new WindowAdapter()
                          { public void windowClosing(WindowEvent e)
                          { System.exit(0);
                          }
                          }
        );
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {  if(!(giveWord.isAlive()))    //������4��  giveWord���÷���isAlive()
        {    giveWord=new WordThread(wordLabel);
        }
            try
            {
                ////////////////////////////////////
                giveWord.start();


                //������5��//giveWord���÷���start()
            }
            catch(Exception exe){}
        }
        else if(e.getSource()==inputText)
        {  if(inputText.getText().equals(wordLabel.getText()))
        {  score++;
        }
            scoreText.setText("�÷�:"+score);
            inputText.setText(null);
        }
    }
}
