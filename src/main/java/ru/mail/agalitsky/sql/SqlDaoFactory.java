package ru.mail.agalitsky.sql;

import ru.mail.agalitsky.dao.DaoFactory;
import ru.mail.agalitsky.dao.DepartmentDao;
import ru.mail.agalitsky.dao.EmployeeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user on 20.10.2014.
 */

public class SqlDaoFactory implements DaoFactory{

    private String user = "root";//Логин пользователя
    private String password = "";//Пароль пользователя
    private String url = "jdbc:mysql://localhost:3306/aimprosoft";//URL адрес
    private String driver = "com.mysql.jdbc.Driver";//Имя драйвера

    public SqlDaoFactory() {
        try {
            Class.forName(driver);  //Регистрируем драйвер
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    @Override
    public DepartmentDao getDepartmentDao(Connection connection) {
        return new SqlDepartmentDao(connection);
    }

    @Override
    public EmployeeDao getEmployeeDao(Connection connection) {
        return new SqlEmployeeDao(connection);
    }
}
