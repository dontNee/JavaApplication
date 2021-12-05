package indi.jends.javapp.lambda;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
@Component
public class LambdaRunner {

    @Value("${switch.lambda}")
    private boolean switcher;

    @PostConstruct
    public void testMethod() {

        if (switcher) {
            List<String> resilt = LambdaUtils.sortedByLength(LambdaUtils.list);
            System.out.println("resilt = " + resilt);
        }
    }
}
