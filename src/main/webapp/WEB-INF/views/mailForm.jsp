<%@ include file="./includes/common.jsp"%>

<html>
<body>
	<h1>Napisz maila</h1>
	<form:form modelAttribute="mail">

		<table border="1">
			<tr>
				<td><spring:message code="imie.label" /></td>
				<td><form:input path="odbiorca.imie" /> <form:errors
						path="odbiorca.imie" /></td>
			</tr>

			<tr>
				<td><spring:message code="nazwisko.label" /></td>
				<td><form:input path="odbiorca.nazwisko" /> <form:errors
						path="odbiorca.nazwisko" /></td>
			</tr>


			<tr>
				<td><spring:message code="mail.label" /></td>
				<td><form:input path="odbiorca.mail" /> <form:errors
						path="odbiorca.mail" /></td>
			</tr>
		</table>
		<hr />

		<table border="1">
			<tr>
				<td><spring:message code="nadawca.label" /></td>
				<td><form:input path="mail.nadawca" /> <form:errors
						path="mail.nadawca" /></td>
			</tr>

			<tr>
				<td><spring:message code="odbiorca.label" /></td>
				<td><form:input path="mail.odbiorca" /> <form:errors
						path="mail.odbiorca" /></td>
			</tr>

			<tr>
				<td><spring:message code="temat.label" /></td>
				<td><form:input path="mail.temat" /> <form:errors
						path="mail.temat" /></td>
			</tr>

			<tr>
				<td><spring:message code="tekstWiadomosci.label" /></td>
				<td><form:input path="mail.tekstWiadomosci" /> <form:errors
						path="mail.tekstWiadomosci" /></td>
			</tr>

			<tr>
				<td><spring:message code="dataNadania.label" /></td>
				<td><form:input path="mail.dataNadania" /> <form:errors
						path="mail.dataNadania" /></td>
			</tr>


		</table>
		<hr />
		<table border="1">
			<tr>
				<td><input type="submit"
					value="<spring:message code="submit.label" />" colspan="2" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>