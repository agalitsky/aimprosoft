<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1>Departments</h1>
<form action="department" method="post" id="department">
    <input type="hidden" value="${param.departmentId}" name="id"> <input
        type="text" value="${dao.read(param.departmentId).name}"
        name="name">
    <div class="form-actions">
        <button type="submit" class="btn btn-primary">Save</button>
        <button type="button" class="btn"
                onclick="window.location.href='index.jsp'">Cancel</button>
    </div>
</form>

