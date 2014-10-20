package ru.mail.agalitsky.dao;

/**
 * Created by user on 20.10.2014.
 */

import ru.mail.agalitsky.domain.Department;

import java.sql.SQLException;
import java.util.List;

/** Объект для управления персистентным состоянием объекта Department */
public interface DepartmentDao {

    /** Создает новую запись и соответствующий ей объект */
    public Department create();

    /** Возвращает объект соответствующий записи с первичным ключом id или null */
    public Department read(int id);

    /** Сохраняет состояние объекта group в базе данных */
    public void update(Department group);

    /** Удаляет запись об объекте из базы данных */
    public void delete(Department group);

    /** Возвращает список объектов соответствующих всем записям в базе данных */
    public List<Department> getAll() throws SQLException;
}
