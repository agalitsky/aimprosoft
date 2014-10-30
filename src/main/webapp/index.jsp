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
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <button class="btn" type="button"
            onclick="window.location.href='addDepartment.jsp'">Add</button>

</p>
</div>