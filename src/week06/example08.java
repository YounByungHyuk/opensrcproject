package week06;

interface Phoneinterface{
    final int TIMEOUT = 10000;
    void sendcall();
    void receivecall();
    default void printLogo(){
        System.out.println("**phone**");
    }
}

class SamsungPhone implements Phoneinterface{
    @Override
    public void sendcall(){
        System.out.println("띠리리리링");
    }
    @Override
    public void receivecall(){
        System.out.println("전화가 왔습니다.");
    }

    public void flash(){
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class example08 {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendcall();
        phone.receivecall();
        phone.flash();
    }
}