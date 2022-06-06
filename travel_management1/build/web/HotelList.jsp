<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Hotels"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOHotels"%>

<!DOCTYPE html>
<html lang="en">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

        <%  List<Hotels> std
                    = (List<Hotels>) request.getAttribute("listh");%>
        <table border=\"1\">
            <thead>
                <tr>
                    <th>Stor_ID</th>
                    <th>stor_name</th>
                    <th>stor_address</th>
                </tr>
                <%for (Hotels temp : std) {%>
            </thead>
            <tbody>

                <tr>
                    <td><%=temp.getHotelId()%></td>
                    <td><%=temp.getHotelName()%></td>
                    <td><%=temp.getAddressId()%></td>

                    <%}%>
                </tr>
            </tbody>
    </body>
</html>