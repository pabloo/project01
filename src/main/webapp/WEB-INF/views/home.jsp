<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Aplikacja do wysyłania maili</h1>
<ul>
		<ul><a href="<c:url value="/dodajOdbiorce"/>" >Dodaj odbiorce</a></ul>
		<ul><a href="<c:url value="/dodajMail"/>" >Dodaj maila</a></ul>
</ul> 
</body>
</html>
