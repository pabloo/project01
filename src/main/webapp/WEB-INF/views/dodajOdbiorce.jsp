<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.tabelka {
	border: 1px solid black;
	border-collapse: collapse;
	background-color: #ffc;
}

.tabelka td {
	border: 1px solid white;
	padding: 3px;
}
</style>
</head>
<body>
	<h1>Dodaj odbiorce</h1>
	<form:form modelAttribute="odbiorca">

		<table class="tabelka">
			<tr>
				<!-- <td><spring:message code="imie.label" /></td> -->
				<td><form:input path="imie" /></td>
				<td><form:errors path="imie" /></td>
			</tr>

			<tr>
				<!-- <td><spring:message code="nazwisko.label" /></td> -->
				<td><form:input path="nazwisko" /></td>
				<td><form:errors path="nazwisko" /></td>
			</tr>


			<tr>
				<!-- <td><spring:message code="mail.label" /></td> -->
				<td><form:input path="mail" /></td>
				<td><form:errors path="mail" /></td>
			</tr>
		</table>

		<br />
		<table class="tabelka">
			<tr>
				<td><input type="submit"
					value="<spring:message code="submit.label" />" colspan="2" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>