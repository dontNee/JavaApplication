package indi.jends.javapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
@ToString
@Data
@AllArgsConstructor
public class Employee {

    private String id;

    private String name;

    private int age;

    private Date dtCreateTime;

    private Date dtUpdateTime;
}
