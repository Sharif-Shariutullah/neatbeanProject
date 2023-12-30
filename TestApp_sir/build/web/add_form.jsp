<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

    <head>
        <title>User Management Application</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>

        <header>
            <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                <div>
                    <a href="#" class="navbar-brand"> Student Management App </a>
                </div>

                <ul class="navbar-nav">
                    <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Users</a></li>
                </ul>
            </nav>
        </header>

        <br>
        <div class="container col-md-5">
            <div class="card">
                <div class="card-body">
                    <form action="add" method="post">
                        <caption><h2>Add New Student</h2></caption>
                        <fieldset class="form-group">
                            <label>User Name</label> 
                            <input type="text" value="" class="form-control" name="name" required="required">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>User Address</label> 
                            <input type="text" value="" class="form-control" name="address" required="required">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>User Date of birth</label> 
                            <input type="date" value="" class="form-control" name="dob">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>User Subject</label> 
                            <input type="text" value="" class="form-control" name="subject">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                    </form>
                </div>
            </div>
        </div>
    </body>

</html>