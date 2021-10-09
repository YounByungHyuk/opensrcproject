package week06;

class Person{
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return  weight;
    }
}

class Student extends Person{
    public void set(){
        age =30;
        name="홍길동";
        height=175;
        setWeight(99);
        System.out.println(age);
        System.out.println(name);
        System.out.println(height);
        System.out.println(getWeight());
    }
}

public class example02 {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
    }
}
