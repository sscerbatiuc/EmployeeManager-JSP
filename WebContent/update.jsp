<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Update employee</title>
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h2>Update Employee Information</h2>
                <form method="post" action="update-employee" class="form-inline">
                    <c:forEach items="${contactById}" var="val">
                        <input type="hidden" name="id" value="${val.key}">
                        <div class="form-group">
                            <label for="poductname">Name:</label> <input type="name"
                                                                         class="form-control" id="name" name="name"
                                                                         value="${val.value.name}">
                        </div>
                        <div class="form-group">
                            <label for="address">Address:</label> <input type="address"
                                                                         class="form-control" id="address" name="address"
                                                                         value="${val.value.address}">
                        </div>
                        <div class="form-group">
                            <label for="phoneno">Phone no:</label> <input type="phoneno"
                                                                          class="form-control" id="phoneno" name="phoneno"
                                                                          value="${val.value.phoneno}">
                        </div>
                        <button type="submit" class="btn btn-default" value="Update">Update</button>
                    </c:forEach>
                </form>
            </div>
        </div>
    </body>
</html>
