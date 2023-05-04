  <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>

	<body>

		<c:if test="${not empty empresa}">
			Produto ${empresa} cadastrado com sucesso!
		</c:if>
		
		<c:if test="${empty produto}">	
		    Nenhum produto cadastrado!
		</c:if>

	</body>
	
</html>