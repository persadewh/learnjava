package chapter14;

/**
 * @Author RayWei
 * @Date 2018/1/2 16:24
 * A simple generic class with two type parameters : T and V
 */

public class TwoGen<T , V> {

    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        this.ob1 = o1;
        this.ob2 = o2;
    }

    void showTypes(){
        System.out.println("Type of T is " + this.ob1.getClass().getName());
        System.out.println("Type of V is " + this.ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}
