package HW10;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class example07 {
    public static void main(String[] args) {
        FileReader fin =null;
        int c;
        try{
            fin = new FileReader("C:\\Users\\ybh82\\Desktop\\8-2.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out,5);
            while ((c = fin.read()) != -1) {
                out.write(c);
            }


            new Scanner(System.in).nextLine();
            out.flush();
            fin.close();
            out.close();
        }catch  (IOException e) {
            e.printStackTrace();
        }
    }
}
