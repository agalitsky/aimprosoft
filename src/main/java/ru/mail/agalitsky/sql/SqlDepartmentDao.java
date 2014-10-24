package ru.mail.agalitsky.sql;

import ru.mail.agalitsky.dao.DepartmentDao;
import ru.mail.agalitsky.domain.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlDepartmentDao implements DepartmentDao {

    private final Connection connection;

    public SqlDepartmentDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Department create(Department department) throws SQLException {
        String sql = "INSERT INTO aimprosoft.Departments (department) VALUES (?);";
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setString(1, department.getDepartment());
        stm.executeUpdate();

        sql = "SELECT id, department FROM aimprosoft.Departments WHERE id = last_insert_id();";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        rs.next();
        department.setId(rs.getInt("id"));
        return department;
    }

    @Override
    public Department read(int id) throws SQLException{
        String sql = "SELECT * FROM aimprosoft.Departments WHERE id = ?;";
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
    public void update(Department department) throws SQLException {
        String sql = "UPDATE aimprosoft.Departments SET department = ? WHERE id= ?;";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, department.getDepartment());
        stm.setInt(2, department.getId());
        stm.executeUpdate();
    }

    @Override
    public void delete(Department department) throws SQLException {
        String sql = "DELETE FROM aimprosoft.Departments WHERE id= ?;";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setInt(1, department.getId());
        stm.executeUpdate();
    }

    @Override
    public List<Department> getAll() throws SQLException {
        String sql = "SELECT * FROM aimprosoft.Departments;";
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
