<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
 href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>
 <div class="container">
  <header>
  </header>
  <div class="starter-template">
   <h1>Users List</h1>
   <table
    class="table table-striped table-hover table-condensed table-bordered" , border="1">
    <tr>
	     <th style="padding: 10px">Patient Details Id</th>
	     <th style="padding: 10px">Patient Name</th>
	     <th style="padding: 10px">Patient Covid Status</th>
	     <th style="padding: 10px">Patient Address</th>
	     <th style="padding: 10px">Edit</th>
	     <th style="padding: 10px">Delete</th>
     </tr>
    <c:forEach var="patientList" items="${patientList}">
     <tr>
	      <td style="padding: 10px">${patientList.patientDetailsId}</td>
	      <td style="padding: 10px">${patientList.patientName}</td>
	      <td style="padding: 10px">${patientList.patientCovidStatus}</td>
	      <td style="padding: 10px">${patientList.patientAddress}</td>
	      <td style="padding: 10px"><a href="/patientupdate/${patientList.patientDetailsId}">Click Here</a></td>
	      <td style="padding: 10px"><a href="/patientdelete/${patientList.patientDetailsId}">Click Here</a></td>
      </tr>
    </c:forEach>
   </table>
  </div>

 </div>

 <script type="text/javascript"
  src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>