package week06;

class Point06{
    private  int x,y;
    public Point06(){
        x=0;
        y=0;
    }
    public Point06(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }
    public  int getY(){
        return y;
    }
    protected void move(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class ColorPoint06 extends Point06 {
    String color;
    public ColorPoint06() {
        color ="Black";
    }
    public ColorPoint06(int x,int y){
        super(x,y);
        color ="Black";
    }
    public void setColor( String color){
        this.color=color;
    }
    public void setXY(int x,int y){
        move(x,y);
    }
    public String toString(){
        return color + "색의 ("+ getX()+","+getY()+")의 점";
    }
}

public class problem06 {
    public static void main(String[] args) {
        ColorPoint06 zeropoint = new ColorPoint06();
        System.out.println( zeropoint.toString()+"입니다.");

        ColorPoint06 cp = new ColorPoint06(10,10);
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }
}