<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,CrudProduto.Produto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard TagLib</title>
</head>

<body>

	<c:if test="${not empty produto}">
			Produto ${produto} cadastrada com sucesso!
		</c:if>

	Lista de produtos: <br />

	<ul>

		<c:forEach items="${produtos}" var="produto">

			<li>
					${produto.nome} - ${produto.descricao} - ${produto.qtPrevistoMes} - ${produto.precoMaxComprado} 
					<a href = "/Produtos/mostraProduto?id=${produto.id}">Editar</a>
					<a href = "/Produtos/removeProduto?id=${produto.id}">Remover</a>
			</li>
		</c:forEach>
	</ul>

</body>
</html>