<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page trimDirectiveWhitespaces="true"%>
<table class="table table-striped">

    <thead>
    <tr>
        <th>#</th>
        <th>Department Name</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="department" items="${dao.departments}">
        <tr>
            <td>${department.id}</td>
            <td>${department.name}</td>
            <td>
                <button class="btn" type="button"
                        onclick="window.location.href='updateDepartment.jsp?depId=${department.id}'">Update</button>
                <button class="btn" type="button"
                        onclick="jQuery.ajax({url:'department?depId=${department.id}',type: 'DELETE'}).done(function(){location.reload();})">Delete</button>
                <button class="btn" type="button"
                        onclick="window.location.href='employees.jsp?depId=${department.id}'">Employees</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <button class="btn" type="button"
            onclick="window.location.href='addDepartment.jsp'">Add</button>

</p>