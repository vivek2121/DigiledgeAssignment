<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<title>Patient Updation Page</title>
<style type="text/css">
    label {
        display: inline-block;
        width: 200px;
        margin: 5px;
        text-align: left;
    }
    button {
        padding: 6px;
        margin: 10px;
       	margin-left: 120px
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Update Patient Record</h2>
        <form:form action="/update" method="post" modelAttribute="patientDetails">
         <form:label path="patientDetailsId">Patient Details Id:</form:label>
            <form:input path="patientDetailsId"/><br/> 
             
            <form:label path="patientName">Patient Name:</form:label>
            <form:input path="patientName"/><br/>   
             
            <form:label path="patientCovidStatus">Patient Covid Status :</form:label>
            <form:input path="patientCovidStatus"/><br/>
                     
            <form:label path="patientAddress">Patient Address:</form:label>
            <form:input path="patientAddress"/><br/>
                 
            <form:button>Register</form:button>
        </form:form>
    </div>
</body>
</html>