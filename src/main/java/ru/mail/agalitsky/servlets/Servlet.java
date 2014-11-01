package ru.mail.agalitsky.servlets;

import ru.mail.agalitsky.dao.DaoFactory;
import ru.mail.agalitsky.dao.DepartmentDao;
import ru.mail.agalitsky.domain.Department;
import ru.mail.agalitsky.sql.SqlDaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static DaoFactory daoFactory = SqlDaoFactory.getInstance();
    DepartmentDao dao;

    Connection con;

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

//         super.doGet(req, resp);
//         resp.sendRedirect("index.jsp");

        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Department name must be not empty");
        }
        String departmentId = req.getParameter("id");
        if (departmentId == null) {
            Department d = new Department();
            d.setName(name);
            try {
                d = dao.create(d);
            } catch (SQLException e) {
                e.printStackTrace();
            }


        } else {
            Department d = new Department();
            d.setId(Integer.valueOf(departmentId));
            d.setName(name);
            try {
                dao.update(d);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        doGet(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String departmentId = req.getParameter("id");
        Department d = new Department();
        d.setId(Integer.valueOf(departmentId));
        try {
            dao.delete(d);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
