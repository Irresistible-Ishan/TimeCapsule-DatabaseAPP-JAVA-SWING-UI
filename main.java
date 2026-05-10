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
}

class showTxtImg{
    public JLabel putText(JFrame frame ,String text , int posx , int posy , int sizex , int sizey , String setFont , boolean boldOrNot , int size){
        JLabel l = new JLabel(text);
        l.setBounds(posx, posy , sizex, sizey);
        l.setHorizontalAlignment(JLabel.CENTER);
        frame.add(l);
        return l;
    }
}

class TimeCapsule{
    public static void main(String args[]){
        createFrame cf = new createFrame();
        JFrame frame = cf.createFrameFunction("TimeCapsule" , 800 , 600 , 200 , 100);
        showTxtImg sti = new showTxtImg();
        JLabel title = sti.putText(frame , "CODE7X NOTES" , 0 , 0 , 100 , 50 , "Arial" , true , 28);
        title.setForeground(Color.BLACK);
        title.setBackground(Color.WHITE);




    }
}