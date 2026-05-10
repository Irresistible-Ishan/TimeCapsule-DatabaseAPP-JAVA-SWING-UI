import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

class createFrame{
    public JFrame createFrameFunction(String name , int sizex ,int sizey , int posx, int posy){
        JFrame frame = new JFrame();
        frame.setTitle(name);
        frame.setSize(sizex,sizey);
        frame.setLocation(posx,posy);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }
    public JPanel createPanelFunction(JFrame frame,int x , int y , int sizex , int sizey){
        JPanel panel = new JPanel();
        panel.setBounds(x,y,sizex, sizey);
        panel.setLayout(null);
        panel.setVisible(true);
        frame.add(panel);
        return panel;
    }
}
class Btn{
    public JButton addbtn(Container frameOrPanel , String text , String hoverText , int x , int y , int sizex , int sizey){
        JButton jbtn = new JButton();
        ImageIcon btnskin = new ImageIcon("./assets/buttons/button-main.png");
        jbtn.setText(text);
        jbtn.setIcon(btnskin);
        jbtn.setHorizontalTextPosition(JButton.CENTER);
        jbtn.setVerticalTextPosition(JButton.CENTER);
        jbtn.setBounds(x,y,sizex,sizey);
        jbtn.setFocusable(true);
        jbtn.setEnabled(true);
        jbtn.setToolTipText(hoverText);
        frameOrPanel.add(jbtn);
        return jbtn;
    }
}
class showTxtImg{
    public JLabel putText(JPanel panel ,String text , int posx , int posy , int sizex , int sizey , String setFont , boolean boldOrNot , int size){
        JLabel l = new JLabel(text);
        l.setBounds(posx, posy , sizex, sizey);
        l.setHorizontalAlignment(JLabel.CENTER);
        panel.add(l);
        return l;
    }
}
class textArea{
    public JTextArea addTextInput(Container panelorframe , int x , int y , int sizex , int sizey){
        JTextArea textarea = new JTextArea();
        textarea.setBounds(x , y , sizex , sizey);
        textarea.setLineWrap(true);
        textarea.setFont(new Font("Arial" , Font.PLAIN , 20));
        textarea.setForeground(Color.BLACK);
        textarea.setBackground(Color.WHITE);
        panelorframe.add(textarea);
        return textarea;
    }
}
class TimeCapsule{
    public static void main(String args[]){
        createFrame cf = new createFrame();
        JFrame frame = cf.createFrameFunction("TimeCapsule" , 800 , 600 , 200 , 100);
        JPanel panel = cf.createPanelFunction(frame,100,0 , 1420 , 740);
        panel.setBackground(Color.LIGHT_GRAY);
        showTxtImg sti = new showTxtImg();
        JLabel title = sti.putText(panel , "CODE7X NOTES" , 100 , 0 , 200 , 50 , "Arial" , true , 28);
        title.setForeground(Color.BLACK);
        title.setBackground(Color.YELLOW);
        Btn btn = new Btn();
        JButton importbtn = btn.addbtn(frame,"Import" , "Import Text from filetype" ,0 , 0 ,100 ,50);
        JButton exportbtn = btn.addbtn(frame,"Export" , "Import Text from filetype" ,0 , 50 ,100 ,50);
        JButton savebtn = btn.addbtn(frame,"Save" , "Import Text from filetype" ,0 , 100 ,100 ,50);
        JButton burnbtn = btn.addbtn(frame,"Burn" , "Import Text from filetype" ,0 , 150 ,100 ,50);
        JButton eleminatebtn = btn.addbtn(frame,"Eleminate" , "Import Text from filetype" ,0 , 200 ,100 ,50);
        JButton newbtn = btn.addbtn(frame,"New" , "Import Text from filetype" ,0 , 250 ,100 ,50);
        JButton openbtn = btn.addbtn(frame,"Open" , "Import Text from filetype" ,0 , 300 ,100 ,50);
        textArea textarea = new textArea();
        textarea.addTextInput(panel , 10 , 30 , 680 , 540);
    }
}