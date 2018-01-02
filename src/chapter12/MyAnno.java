package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author RayWei
 * @Date 2018/1/2 15:23
 *
 * 保留策略
 * @Retention(retention-policy)
 * SOURCE
 * CLASS
 * RUNTIME
 *
 *
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}
