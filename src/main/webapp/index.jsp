<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page trimDirectiveWhitespaces="true"%>
<div class="container">
<table class="table table-bordered ">


    <tr>
        <th>#</th>
        <th>Department Name</th>
        <th></th>
    </tr>
    <tbody>
    <c:forEach var="Department" items="${list}">
        <tr>
            <td>${Department.id}</td>
            <td>${Department.name}</td>
            <%--<td>--%>
                <%--<button class="btn" type="button"--%>
                        <%--onclick="window.location.href='updateDepartment.jsp?departmentId=${department.id}'">Update</button>--%>
                <%--<button class="btn" type="button"--%>
                        <%--onclick="jQuery.ajax({url:'name?departmentId=${department.id}',type: 'DELETE'}).done(function(){location.reload();})">Delete</button>--%>
                <%--<button class="btn" type="button"--%>
                        <%--onclick="window.location.href='employees.jsp?departmentId=${department.id}'">Employees</button>--%>
            <%--</td> --%>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <%--<button class="btn" type="button"--%>
            <%--onclick="window.location.href='addDepartment.jsp'">Add</button>--%>

</p>
</div>