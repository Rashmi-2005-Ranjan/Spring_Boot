package in.beanlifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//@Component
public class CartService /*implements InitializingBean*/ {
    Map<Integer, String>map;

    public  CartService() {
        map = new HashMap<>();
        System.out.println ("CartService constructor called");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        map.put ( 1, "Product 1");
//        map.put ( 2, "Product 2");
//        System.out.println("Initialization callback");
//    }

    public void start() {
        map.put ( 1, "Product 1");
        map.put ( 2, "Product 2");
        System.out.println("Initialization callback");
    }

    public void addToCart() {
        System.out.println(" added to cart.");
    }

    public String getValue(int key) {
        return map.getOrDefault (key, "Product not found");
    }
}
