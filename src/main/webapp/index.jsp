<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <td>
                <button class="btn" type="button"
                        onclick="window.location.href='updateDepartment.jsp?departmentId=${Department.id}&departmentName=${Department.name}'">Update</button>
                <form style="display:none" action="Servlet" method="post" id="department" name ="delete">
                    <input type="hidden" value="${Department.id}" name="id">
                    <input type="hidden" value="3" name="select">
                </form>
                <button class="btn" type="button"
                        onclick="document.forms['delete'].submit()">Delete</button>

            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <button class="btn" type="button"
            onclick="window.location.href='addDepartment.jsp'">Add</button>
</p>
</div>