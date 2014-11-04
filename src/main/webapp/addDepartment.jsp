<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Departments</h1>
<form action="Servlet" method="post" id="department">
    <input type="hidden" value="1" name="select">
    <input type="text" placeholder="Department name" name="name">
    <div class="form-actions">
        <button type="submit" class="btn btn-primary">Add</button>
        <button type="button" class="btn"
                onclick="window.location.href='Servlet'">Cancel</button>
    </div>
</form>


