<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font size=20 color=red> First Name : <%=session.getAttribute("addr") %> </font>
 <font size=20 color=red> Middle Name : <%=session.getAttribute("cty") %> </font>
 <font size=20 color=red> Last Name : <%=session.getAttribute("stat") %> </font>
 <font size=20 color=red> First Name : <%=session.getAttribute("ctry") %> </font>
 <font size=20 color=red> Middle Name : <%=session.getAttribute("phn") %> </font>
</body>
</html>