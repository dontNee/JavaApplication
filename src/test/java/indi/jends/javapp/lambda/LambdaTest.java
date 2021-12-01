package indi.jends.javapp.lambda;

import org.junit.Assert;
import org.junit.Test;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
public class LambdaTest {

    @Test
    public void lambdaTest_1()
    {
        MathOperationTest addition = (a, b) -> {
            return a + b;
        };

        System.out.println("addition = " + addition.operate(5,6));
    }

}
