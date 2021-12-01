package indi.jends.javapp.factory;

import org.springframework.stereotype.Component;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
@Component
public class AudiFactory implements  VehicleFactory {

    @Override
    public Vehicle create() {
        //Start
        System.out.println("AudiFactory is working");
        //Create
        System.out.println("Audi is creating");
        //return
        return new Audi();
    }
}
