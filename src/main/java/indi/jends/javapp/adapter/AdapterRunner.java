package indi.jends.javapp.adapter;

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
public class AdapterRunner {

    @Autowired
    private DispatchServlet dispatchServlet;

    @Value("${switch.adapter}")
    private boolean switcher;

    @PostConstruct
    public void testMethod() {
        //模块开关
        if (switcher) {
            dispatchServlet.doDispatch(new SimpleController());
        }
    }
}
