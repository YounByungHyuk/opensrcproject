package week06;

class Person03{}
class Student03 extends Person03{}
class Researcher extends  Person03{}
class Professor extends  Researcher{}


public class example04 {
    static void print(Person03 P){
        if (P instanceof Person03)
            System.out.print("Person ");
        if (P instanceof  Student03)
            System.out.print("Student ");
        if (P instanceof Researcher)
            System.out.print("Researcher ");
        if (P instanceof Professor)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new student() ->\t");
        print(new Student03());
        System.out.print("new Researcher() ->\t");
        print(new Researcher());
        System.out.print("new Professor() ->\t");
        print(new Professor());
    }
}
