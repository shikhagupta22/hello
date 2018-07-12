<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Home Page</title>
</head>
<body>
<table id="example" cellspacing="0"  class="display" width="60%">
        <thead>
            <tr>
                <th>Vendor Code</th>
                <th>Vendor Name</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                 <th>Vendor Code</th>
                <th>Vendor Name</th>
            </tr>
        </tfoot>
        <tbody>
       
                <c:forEach items="${vendors}" var="vendor">
			   <tr>
                        <td>${vendor.vId}</td>
                           <td>${vendor.vName}</td>
                    </tr>
			</c:forEach>
        </tbody>
        </table>
      

<script src="https://code.jquery.com/jquery-1.12.4.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" type="text/javascript"></script>
<script>
$(document).ready(function()
{
    $('#example').DataTable();
} );
</script>
</body>
</html>