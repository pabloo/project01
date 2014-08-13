<%@ include file="./includes/common.jsp"%>

<html>
<head>

<title>Insert title here</title>
<style>
.tabelka {
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
	<h1>Napisz maila</h1>
	<form:form modelAttribute="mail">

		<table class="tabelka">
			<tr>
				<td><spring:message code="odbiorcy.label" /></td>
				<td><form:input path="odbiorcy" /> <form:errors
						path="odbiorcy" /></td>
			</tr>

		</table>
		<hr />

		<table class="tabelka">
			<tr>
				<td><spring:message code="nadawca.label" /></td>
				<td><form:input path="nadawca" /> <form:errors
						path="nadawca" /></td>
			</tr>


			<tr>
				<td><spring:message code="temat.label" /></td>
				<td><form:input path="temat" /> <form:errors
						path="temat" /></td>
			</tr>

			<tr>
				<td><spring:message code="tekstWiadomosci.label" /></td>
				<td><form:input path="tekstWiadomosci" /> <form:errors
						path="tekstWiadomosci" /></td>
			</tr>

			<tr>
				<td><spring:message code="dataNadania.label" /></td>
				<td><form:input path="dataNadania" /> <form:errors
						path="dataNadania" /></td>
			</tr>


		</table>
		<hr />
		<table class="tabelka">
			<tr>
				<td><input type="submit"
					value="<spring:message code="submit.label" />" colspan="2" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>