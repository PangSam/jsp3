<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>GET</h1>			

<form method="get" action="HelloServlet">
	이름   : <input type="text" name="abc"><br>
	아이디 : <input type="text" name="ID"><br>
	비밀번호:<input type="password" name="pwd"><br>
	
<input type="submit" value="GET 방식으로 전송 ">

</form>

<a href="HelloServlet">링크를 GET 방식</a>

<hr>
<h1>POST</h1>
<form method="Post" action="HelloServlet">
		이름   : <input type="text" name="abc"><br>
	아이디 : <input type="text" name="ID"><br>
	비밀번호:<input type="password" name="pwd"><br>
	
<input type="submit" value="POST 방식으로 전송">

</form>
<h1>JSP</h1>
<form method="Post" action="test3.jsp">		<%//test3 jsp로 이동 %>
		이름   : <input type="text" name="abc"><br>
	아이디 : <input type="text" name="ID"><br>
	비밀번호:<input type="password" name="pwd"><br>
	
<input type="submit" value="JSP 방식으로 전송">

</form>


</body>
</html>