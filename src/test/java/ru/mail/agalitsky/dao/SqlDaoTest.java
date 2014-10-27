package ru.mail.agalitsky.dao;


import org.junit.Assert;
import org.junit.Test;
import ru.mail.agalitsky.domain.Department;
import ru.mail.agalitsky.sql.SqlDaoFactory;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 22.10.2014.
 */

public class SqlDaoTest extends SqlDaoFactory{

    @Test
    public void testGetAll() throws Exception {
        DaoFactory daoFactory = new SqlDaoFactory();
        List<Department> list;
        Connection con = daoFactory.getConnection();
        DepartmentDao dao = daoFactory.getDepartmentDao(con);

        Department department = new Department();

        // create department
//        department.setDepartment("Department #3");
//        department = dao.create(department);
//        System.out.println(department.getDepartment() + " " + department.getId());

        //read department
//        department = dao.read(3);
//        System.out.println(department.getId() + " " + department.getDepartment());

        // update department
//        department.setId(2);
//        department.setDepartment("Новый департамет");
//        dao.update(department);

        // delete department
//        department.setId(1);
//        dao.delete(department);

        list = dao.getAll();

        for (Department d : list) {
            System.out.println(d.getId() + " " + d.getDepartment());
        }


        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0);
    }
}
