<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
<title>Technical LIST</title>
</head>
<body>


<table>
	<tr>
		<th>ID</th>
		<th>KEY</th>
		<th>VALUE</th>
		<th>ENABLED</th>
	</tr>
	
	<c:forEach var="techni" items="${LST}">
		<tr>
			<td> ${techni.id} </td>
			<td> ${techni.key} </td>
			<td> ${techni.value} </td>
			<td> ${techni.enabled} </td>
		</tr>
	</c:forEach>	
	
</table>
				




</body>

</html>


