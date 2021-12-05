package indi.jends.javapp.proxy.impl;

import indi.jends.javapp.model.Employee;
import indi.jends.javapp.proxy.EmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
@Component
public class EmployeeServiceStaticProxy implements EmployeeService {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Override
    public void updateById(Employee e) {

        logger.info("before update");

    }

    @Override
    public Employee findById(String id) {
        return null;
    }
}
