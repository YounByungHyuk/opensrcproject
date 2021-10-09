package week06;


abstract class PairMap{
    protected String keyArray [];
    protected String valueArray[];
    abstract String get(String key); // 키값 가진 밸류 리턴 없으면 널 리턴
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length(); // 아이탬의 개수 리턴
}

class Dictionary extends PairMap{
    protected int select=0;
    public Dictionary (int x){
        keyArray = new String[x];
        valueArray = new String[x];
    }

    @Override
    String get(String key) {
        String a = null;
        for(int i=0;i< keyArray.length;i++){
            if(key.equals(keyArray[i]))
                a=valueArray[i];
        }
        return  a;
    }

    @Override
    void put(String key, String value) {
        boolean a = true;
        for(int i=0;i< keyArray.length;i++){
            if(key.equals(keyArray[i])) {
                valueArray[i] = value;
                a= false;
            }
        }
        if(a){
            keyArray[select] = key;
            valueArray[select] = value;
            select++;
        }

    }

    @Override
    String delete(String key) {
        for(int i=0;i< keyArray.length;i++){
            if(key.equals(keyArray[i])) {
                String k = valueArray[i];
                valueArray[i] = null;
                keyArray[i]=null;
                return  k;
            }
        }
        return null;
    }

    @Override
    int length() {
        return select;
    }
}

public class problem10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+ dic.get("이재문"));
        System.out.println( "황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+ dic.get("황기태"));

    }
}
