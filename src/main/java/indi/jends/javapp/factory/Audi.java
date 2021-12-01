package indi.jends.javapp.factory;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
public class Audi implements Vehicle {

    @Override
    public void run() {
        System.out.println("Audi is created by Germany's Vehicle Factory");
    }
}
