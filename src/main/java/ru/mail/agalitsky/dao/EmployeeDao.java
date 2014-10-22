package ru.mail.agalitsky.dao;

/**
 * Created by user on 20.10.2014.
 */

import ru.mail.agalitsky.domain.Employee;

import java.util.List;

/** Объект для управления персистентным состоянием объекта Employee */
public interface EmployeeDao {

    /** Создает новую запись и соответствующий ей объект */
    public Employee create(Employee employee);

    /** Возвращает объект соответствующий записи с первичным ключом id или null */
    public Employee read(int id);

    /** Сохраняет состояние объекта Employee в базе данных */
    public void update(Employee employee);

    /** Удаляет запись об объекте из базы данных */
    public void delete(Employee employee);

    /** Возвращает список объектов соответствующих всем записям в базе данных */
    public List<Employee> getAll();

}
