package ru.mail.agalitsky.servlets;

import ru.mail.agalitsky.dao.DaoFactory;
import ru.mail.agalitsky.dao.DepartmentDao;
import ru.mail.agalitsky.domain.Department;
import ru.mail.agalitsky.sql.SqlDaoFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class Servlet extends HttpServlet {

    private static DaoFactory daoFactory = SqlDaoFactory.getInstance();

    DepartmentDao dao;
    Department d;
    Connection con = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            con = daoFactory.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dao = daoFactory.getDepartmentDao(con);
        List<Department> list = null;
        try {
            list = dao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("list", list);
        req.setAttribute("id", d.getId());
        req.setAttribute("name", d.getName());
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Connection con = null;
        try {
            con = daoFactory.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dao = daoFactory.getDepartmentDao(con);
        String name = req.getParameter("name");
        d = new Department();

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Department name must be not empty");
        }

        String departmentId = req.getParameter("id");

        if (departmentId == null) {
            d.setName(name);
            try {
                dao.create(d);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            d.setId(Integer.valueOf(departmentId));
            try {
                dao.update(d);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

         resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);

        d.setId(Integer.valueOf(req.getParameter("departmentId")));
        try {
            dao.delete(d);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
