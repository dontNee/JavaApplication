package indi.jends.javapp.proxy;

import indi.jends.javapp.model.Employee;

public interface EmployeeService {

    void updateById(Employee e);

    Employee findById(String id);
}
