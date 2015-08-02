<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Bostania Online.com</h1>
<c:forEach var="productItem" items="${prdList}"> 
    <c:out value="${productItem.productId}"/> - <c:out value="${productItem.name}"/> - <c:out value="${productItem.description}"/> <br> 
</c:forEach>

<form action="addNewProduct" method="post">

	Product Name <input type="text" name="name"/><br>
	Product Description <input type="text" name="description"/><br>
	Product Price <input type="text" name="price"/><br>
	Product Image Name <input type="text" name="imageName"/><br>
	<input type="submit" value="Add New Product">
</form>
</body>
</html>