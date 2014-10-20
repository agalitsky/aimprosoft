package ru.mail.agalitsky.mysql;

import ru.mail.agalitsky.dao.EmployeeDao;
import ru.mail.agalitsky.domain.Employee;

import java.sql.Connection;
import java.util.List;

/**
 * Created by user on 20.10.2014.
 */

public class MySqlEmployeeDao implements EmployeeDao {
    private final Connection connection;

    public MySqlEmployeeDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Employee create() {
        return null;
    }

    @Override
    public Employee read(int id) {
        return null;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public List<Employee> getAll() {
        return null;
    }
}
