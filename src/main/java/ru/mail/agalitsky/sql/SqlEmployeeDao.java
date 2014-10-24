package ru.mail.agalitsky.sql;

import ru.mail.agalitsky.dao.EmployeeDao;
import ru.mail.agalitsky.domain.Employee;

import java.sql.Connection;
import java.util.List;

public class SqlEmployeeDao implements EmployeeDao {
    private final Connection connection;

    public SqlEmployeeDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Employee create(Employee employee) {
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
