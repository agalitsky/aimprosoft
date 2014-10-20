package ru.mail.agalitsky.mysql;

import ru.mail.agalitsky.dao.DepartmentDao;
import ru.mail.agalitsky.domain.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public Department read(int id) throws SQLException{
        String sql = "SELECT * FROM aimprosoft.Department WHERE id = ?;";
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();
        rs.next();
        Department d = new Department();
        d.setId(rs.getInt("id"));
        d.setDepartment(rs.getString("department"));

        return d;
    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void delete(Department department) {

    }

    @Override
    public List<Department> getAll() throws SQLException {
        String sql = "SELECT * FROM aimprosoft.Department;";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        List<Department> list = new ArrayList<Department>();
        while (rs.next()) {
            Department d = new Department();
            d.setId(rs.getInt("id"));
            d.setDepartment(rs.getString("department"));
            list.add(d);
        }
        return list;
    }
}
