package chapter14;

/**
 * @Author RayWei
 * @Date 2018/1/2 16:13
 * T is a type parameter that will be replaced by a real type when an object of type Gen is created.
 */

public class Gen<T> {

    T ob;

    Gen(T o){
        this.ob = o;
    }

    T getOb(){
        return this.ob;
    }

    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
