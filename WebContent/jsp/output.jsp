<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font size=5 color=red> First Name : <%=session.getAttribute("first_name") %> </font><br>
 <font size=5 color=red> Middle Name : <%=session.getAttribute("middle_name") %> </font><br>
 <font size=5 color=red> Last Name : <%=session.getAttribute("last_name") %> </font><br>
 
 <font size=5 color=red> Address : <%=session.getAttribute("addr") %> </font><br>
 <font size=5 color=red> City : <%=session.getAttribute("cty") %> </font><br>
 <font size=5 color=red> State : <%=session.getAttribute("stat") %> </font><br>
 <font size=5 color=red> Country : <%=session.getAttribute("ctry") %> </font><br>
 <font size=5 color=red> Phone : <%=session.getAttribute("phn") %> </font><br>

<font size=5 color=red> Bank Name : <%=session.getAttribute("bank_name") %> </font><br>
 <font size=5 color=red> Acc Num : <%=session.getAttribute("acc_num") %> </font><br>
 <font size=5 color=red> Ssn Num : <%=session.getAttribute("ssn_num") %> </font>
 
</body>
</html>