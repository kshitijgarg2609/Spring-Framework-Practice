<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Customers</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
<div class="card">
  <div class="card-body">
  	<h5 class="card-title">Spring MVC Customer List</h5>
  	<input type="button" value="Add Customer" onclick="window.location.href='create-form'; return false;" class="btn btn-primary"/>
  	<table class="table table-bordered">
  		<thead>
  			<tr>
  				<th scope="col">Customer ID</th>
  				<th scope="col">Name</th>
  				<th scope="col">City</th>
  				<th scope="col">Age</th>
  				<th scope="col">Action</th>
  			</tr>
  		</thead>
  		<tbody>
  			<c:forEach var="cust" items="${customers_list}">
  				<c:url var="update_link" value="/update-form">
  					<c:param name="id" value="${cust.id}"></c:param>
  				</c:url>
  				<c:url var="delete_link" value="/delete">
  					<c:param name="id" value="${cust.id}"></c:param>
  				</c:url>
  				<tr>
  					<td>${cust.id}</td>
  					<td>${cust.name}</td>
  					<td>${cust.city}</td>
  					<td>${cust.age}</td>
  					<td><a href="${update_link}">Update</a> | <a href="${delete_link}" onclick="if(!(confirm('deleting?')))return false">Delete</a></td>
  				</tr>
  			</c:forEach>
  		</tbody>
  	</table>
  </div>
</div>
</body>
</html>