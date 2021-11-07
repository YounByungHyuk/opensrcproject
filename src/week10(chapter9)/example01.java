package C;

import javax.swing.*;
public class example01 extends JFrame {
    public example01() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        example01 frame = new example01();
    }
}
