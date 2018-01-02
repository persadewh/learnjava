package chapter12;

import java.lang.reflect.Method;

/**
 * @Author RayWei
 * @Date 2018/1/2 15:29
 */

public class Meta {

    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        Class<?> c = ob.getClass();
        try {
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + "   " + anno.val());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        myMeth();
    }
}
