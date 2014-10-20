package ru.mail.agalitsky.dao;

/**
 * Created by user on 20.10.2014.
 */

import java.sql.Connection;
import java.sql.SQLException;

/** Фабрика объектов для работы с базой данных */
public interface DaoFactory {
    /** Возвращает подключение к базе данных */
    public Connection getConnection() throws SQLException;

    /**Возвращает объект для управления персистентным состоянием объекта Department */
    public DepartmentDao getDepartmentDao(Connection connection);

    /** Возвращает объект для управления персистентным состоянием объекта Employee */
    public EmployeeDao getEmployeeDao(Connection connection);
}
