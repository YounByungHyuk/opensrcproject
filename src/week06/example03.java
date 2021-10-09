package week06;

class Point01{
    private int x,y;
    public Point01(){
        this.x=this.y=0;
    }
    public Point01(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void showPoint(){
        System.out.println("("+x+","+y+")");

    }
}

class ColorPoint01 extends Point01{
    private String color;
    public ColorPoint01(int x, int y, String color){
        super(x,y);
        this.color=color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}

public class example03 {
    public static void main(String[] args) {
        ColorPoint01 cp = new ColorPoint01(5,6,"파랑");
        cp.showColorPoint();

    }
}
