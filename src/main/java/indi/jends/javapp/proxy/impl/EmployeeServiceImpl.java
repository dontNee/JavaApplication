package indi.jends.javapp.proxy.impl;

import indi.jends.javapp.model.Employee;
import indi.jends.javapp.proxy.EmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
@Component
public class EmployeeServiceImpl implements EmployeeService {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private DataSource dataSource;

    @Override
    public void updateById(Employee e) {

        logger.info("updating");
    }

    @Override
    public Employee findById(String id) {

        logger.info("finding");

        //execute sql
        StringBuilder sql = new StringBuilder();
        //create sql
        sql.append(" SELECT ");
        sql.append("   * ");
        sql.append(" FROM   ");
        sql.append("   tbl_employee ");
        sql.append(" WHERE ");
        sql.append("   s_id = '%s' ");
        //init sql
        String executesql = String.format(sql.toString(), id);

        try {
            //get Connection with db
            Connection connection = dataSource.getConnection();
            //create statement
            Statement statement = connection.createStatement();
            //create sql
            ResultSet resultSet = statement.executeQuery(executesql);
            //get result
            if (resultSet.next())
            {
                Employee employee = new Employee(
                        resultSet.getString("s_id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getDate("dt_createtime"),
                        resultSet.getDate("dt_updatetime"));
                return employee;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Employee();
    }
}
