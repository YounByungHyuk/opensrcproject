package week06;

interface Phoneinterface09{
    final int TIMEOUT = 10000;
    void sendcall();
    void receivecall();
    default void printLogo(){
        System.out.println("**phone**");
    }
}

interface MobilePhoneInterface extends Phoneinterface09{
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface{
    public void play();
    public void stop();
}

class PDA{
    public int calulate(int x, int y){
        return x+y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
    @Override
    public  void sendcall(){
        System.out.println("따르릉따르릉~~");
    }

    @Override
    public void receivecall(){
        System.out.println("전화 왔어요.");
    }

    @Override
    public void sendSMS(){
        System.out.println("문자갑니다.");
    }

    @Override
    public void receiveSMS(){
        System.out.println("문자왔어요.");
    }

    @Override
    public void play() {
        System.out.println("음악 연주합니다.");
    }
    @Override
    public void stop() {
        System.out.println("음악 중단합니다.");
    }

    public void schedule(){
        System.out.println("일정 관리합니다.");
    }
}

public class example09 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendcall();
        phone.play();
        System.out.println("3과 5를 더하면 "+phone.calulate(3,5));
        phone.schedule();
    }
}