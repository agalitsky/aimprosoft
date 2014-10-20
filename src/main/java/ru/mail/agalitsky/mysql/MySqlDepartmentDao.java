package ru.mail.agalitsky.mysql;

import ru.mail.agalitsky.dao.DepartmentDao;
import ru.mail.agalitsky.domain.Department;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 20.10.2014.
 */

public class MySqlDepartmentDao implements DepartmentDao {
    private final Connection connection;

    public MySqlDepartmentDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Department create() {
        return null;
    }

    @Override
    public Department read(int id) {
        return null;
    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void delete(Department department) {

    }

    @Override
    public List<Department> getAll() throws SQLException {
        return null;
    }
}
