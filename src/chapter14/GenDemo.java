package chapter14;

/**
 * @Author RayWei
 * @Date 2018/1/2 16:16
 */

public class GenDemo {

    public static void main(String[] args){
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("value : " + v);

        Gen<String> strOb = new Gen<>("Generics Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value : " + str);

        TwoGen<Integer, String> tgObj = new TwoGen<>(88,"Generics");
        tgObj.showTypes();
    }
}
