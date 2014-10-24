package ru.mail.agalitsky.dao;

import ru.mail.agalitsky.domain.Department;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/** Объект для управления персистентным состоянием объекта Department */
public interface DepartmentDao {

    /** Создает новую запись и соответствующий ей объект */
    public Department create(Department department) throws SQLException;

    /** Возвращает объект соответствующий записи с первичным ключом id или null */
    public Department read(int id) throws SQLException;

    /** Сохраняет состояние объекта Department в базе данных */
    public void update(Department department) throws SQLException;

    /** Удаляет запись об объекте из базы данных */
    public void delete(Department department) throws SQLException;

    /** Возвращает список объектов соответствующих всем записям в базе данных */
    public List<Department> getAll() throws SQLException;
}
