package week11;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class problem06 extends JFrame{
    JLabel label;
    problem06(){
        setTitle("클릭 연습용 응용프로그램");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        label= new JLabel("C");
        label.setSize(100,50);
        label.setLocation(100,100);
        label.addMouseListener(new MyMouseAdapter());


        add(label);
        setSize(500,500);
        setVisible(true);
        label.requestFocus();


    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new problem06();
    }

    class MyMouseAdapter extends MouseAdapter{
        int x,y;
        public void mousePressed(MouseEvent e) {
            x = (int)(Math.random()*400);
            y = (int)(Math.random()*400);
            label.setLocation(x,y);
        }
    }
}