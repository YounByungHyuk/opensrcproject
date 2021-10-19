package week07;

class Point { // 이후 나오는 exampel 2,3내용도 구현
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {  // 5-2에 사용
        return "Point(" + x + "," + y + ")";
    }
    public boolean equals(Object obj) {//5-3에 사용
        Point p = (Point)obj;
        if(x == p.x && y == p.y) return true;
        else return false;
    }
}
public class example01 {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName()); // 클래스 이름
        System.out.println(obj.hashCode()); // 해시 코드 값
        System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
        System.out.println(obj); // 객체 출력
    }
    public static void main(String [] args) {
        Point p = new Point(2,3);
        print(p);
    }
}