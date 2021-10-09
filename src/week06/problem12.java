package week06;

import java.util.Scanner;

abstract class Shape12 {
    private Shape12 next;
    public Shape12() { next = null; }
    public void setNext(Shape12 obj) { next = obj; }
    public Shape12 getNext() { return next; }
    public abstract void draw();
}

class Line12 extends Shape12 {
    String name ="line";
    public void draw() {
        System.out.println("Line");
    }
}
class Rect12 extends Shape12 {
    String name ="Rect";
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle12 extends Shape12 {
    String name ="circle";
    public void draw() {
        System.out.println("Circle");
    }
}

public class problem12 {
    private Shape12 head, tail;
    private Scanner sc;
    public problem12() {
        head = null;
        tail = null;
        sc = new Scanner(System.in);
    }
    public void run() {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    num = sc. nextInt();
                    insert(num);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치 >> ");
                    num = sc.nextInt();
                    delete(num);
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    sc.close();
                    return;
            }
        }
    }
    public void insert(int draw) {
        Shape12 grapic;
        switch(draw) {
            case 1:
                grapic = new Line12();
                break;
            case 2:
                grapic = new Rect12();
                break;
            case 3:
                grapic = new Circle12();
                break;
            default:
                System.out.println("다시 입력해 주세요.");
                return;
        }
        if(head == null) {
            head = grapic;
            tail = grapic;
        }
        else {
            tail.setNext(grapic);
            tail = grapic;
        }
    }
    public void print() {
        Shape12 s = head;
        while(s != null) {
            s.draw();
            s = s.getNext();
        }
    }
    public void delete(int num) {
        Shape12 cur = head;
        Shape12 tmp = head;
        int i;
        if( num == 1) {
            if(head == tail) {
                head = null;
                tail = null;
                return;
            }
            else {
                head = head.getNext();
                return;
            }
        }
        for(i=1; i<num; i++) {
            tmp = cur;
            cur = cur.getNext();
            if(cur == null) {
                System.out.println("삭제할 수 없습니다.");
                return;
            }
        }
        if(i==num) {
            tmp.setNext(cur.getNext());
            tail = tmp;
        }
        else
            tmp.setNext(cur.getNext());
    }
    public static void main(String[] args) {

        problem12 editor = new problem12();
        editor.run();
    }
}