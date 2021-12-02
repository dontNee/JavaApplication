package indi.jends.javapp.lambda;

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

    @PostConstruct
    public void testMethod() {

        List<String> resilt = LambdaUtils.sortedByLength(LambdaUtils.list);

        System.out.println("resilt = " + resilt);
    }
}
