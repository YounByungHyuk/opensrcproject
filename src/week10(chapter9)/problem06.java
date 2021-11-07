package C;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame5 extends JFrame{
    public MyFrame5() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();

        c.setLayout(null);

        for(int i=0;i<20;i++) {
            int x=(int )(Math.random()*200)+50;
            int y=(int )(Math.random()*200)+50;
            JLabel l=new JLabel(" ");
            l.setBounds(x,y,10,10);
            l.setOpaque(true);
            l.setBackground(Color.blue);
            c.add(l);
        }

        setSize(300,300);
        setVisible(true);
    }
}

public class problem06 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new MyFrame5();
    }

}
