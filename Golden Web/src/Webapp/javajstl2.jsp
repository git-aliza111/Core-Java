<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/mytags.tld" prefix="Aliza" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>
<Aliza:checkNumber num="<%=request.getParameter(\"number\") %>" />
</h1>
</body>
</html>