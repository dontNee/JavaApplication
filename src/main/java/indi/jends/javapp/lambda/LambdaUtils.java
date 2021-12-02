package indi.jends.javapp.lambda;

import indi.jends.javapp.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
public class LambdaUtils {

    public static List<String> list = Arrays.asList("swim", "FootBall", "BasketBall", "chess");

    public static List<Employee> employees = new ArrayList<Employee>();

    static {
        employees.add(new Employee("1","lbf",24,new Date(),new Date()));
        employees.add(new Employee("2","qfs",30,new Date(),new Date()));
        employees.add(new Employee("3","wlj",50,new Date(),new Date()));
        employees.add(new Employee("5","yzg",30,new Date(),new Date()));
        employees.add(new Employee("6","hxy",27,new Date(),new Date()));
    }

    public static List<String> sortedByLength(List<String> paramList) {

        if (null == paramList)
            return new ArrayList<>();

        return paramList.stream().sorted().collect(Collectors.toList());
    }
}
