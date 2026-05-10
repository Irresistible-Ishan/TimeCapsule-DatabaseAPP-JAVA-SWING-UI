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

class showTxtImg{
    public JLabel putText(JPanel panel ,String text , int posx , int posy , int sizex , int sizey , String setFont , boolean boldOrNot , int size){
        JLabel l = new JLabel(text);
        l.setBounds(posx, posy , sizex, sizey);
        l.setHorizontalAlignment(JLabel.CENTER);
        panel.add(l);
        return l;
    }
}

class TimeCapsule{
    public static void main(String args[]){
        createFrame cf = new createFrame();
        JFrame frame = cf.createFrameFunction("TimeCapsule" , 800 , 600 , 200 , 100);
        JPanel panel = cf.createPanelFunction(frame,100,0 , 700 , 600);
        panel.setBackground(Color.LIGHT_GRAY);
        showTxtImg sti = new showTxtImg();
        JLabel title = sti.putText(panel , "CODE7X NOTES" , 100 , 0 , 200 , 50 , "Arial" , true , 28);
        title.setForeground(Color.BLACK);
        title.setBackground(Color.YELLOW);





    }
}