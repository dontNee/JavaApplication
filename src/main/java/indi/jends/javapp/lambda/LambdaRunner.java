package indi.jends.javapp.lambda;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

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
        MathOperation addition = (int a, int b) -> a + b;

        System.out.println(addition.operation(5,6));
    }
}
