package indi.jends.javapp.factory;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
public class Acura implements Vehicle {

    @Override
    public void run() {
        System.out.println("Acura is created by Japan's Vehicle Facory...");
    }
}
