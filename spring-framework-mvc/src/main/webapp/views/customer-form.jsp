<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Form</title>

<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
<div class="card">
  <div class="card-body">
    <h5 class="card-title">Spring MVC Add Customer Form</h5>
    <form:form action="${form_action}" cssClass="form-horizontal" method="post" modelAttribute="customer">
    	<form:hidden path="id" />
    	<div class="form-group row">
    		<label for="name" class="col-sm-2 col-form-label">Customer Name</label>
    		<div class="col-sm-10">
    			<form:input path="name" cssClass="form-control" />
    		</div>
    	</div>
    	<div class="form-group row">
    		<label for="city" class="col-sm-2 col-form-label">City</label>
    		<div class="col-sm-10">
    			<form:input path="city" cssClass="form-control" />
    		</div>
    	</div>
    	<div class="form-group row">
    		<label for="age" class="col-sm-2 col-form-label">Age</label>
    		<div class="col-sm-10">
    			<form:input path="age" cssClass="form-control" />
    		</div>
    	</div>
    	<div class="form-group row">
    		<div class="col-sm-10">
    			<form:button class="btn btn-primary">${action_btn}</form:button>
    		</div>
    	</div>
   	</form:form>
  </div>
</div>
</body>
</html>