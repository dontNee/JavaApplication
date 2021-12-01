package indi.jends.javapp.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
@Component
public class VehicleFactoryRunner {

    @Autowired
    private AudiFactory audiFactory;

    @Value("${switch.factory}")
    private boolean switcher;

    @PostConstruct
    public void testMethod() {

        if (switcher) {
            //Need
            System.out.println("I need an Audi");
            //Find
            System.out.println("I find AudiFactory");
            //Get
            Audi audi = (Audi) audiFactory.create();
            audi.run();
        }

    }
}
