<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<nav class="navbar navbar-default" role="navigation">
	
	<div class="navbar-header">
		<a class="navbar-brand" href="<c:url value='/accueil/' />">Meehome CV</a>
	</div>
	
	<form:form method="POST" commandName="authentification" action="/connexion" class="navbar-form form-inline">

		<form:errors path="*" cssClass="ui-state-error ui-corner-all error" element="div" />

		<c:choose>
			<c:when test="${empty userAuthentificated.nom}">
				<div class="form-group">
					<form:input path="email" placeholder="email" class="form-control" />
				</div><div class="form-group">
					<form:password path="password" placeholder="password" class="form-control" />
				</div>
				<button class="btn btn-default" type="submit">Connexion</button>
			</c:when>
			<c:otherwise>
				<div style="text-align:right">
					Bienvenu <b>${userAuthentificated.nom} ${userAuthentificated.prenom}</b><br/>
					<a href="<c:url value='/deconnexion' />">D�connexion</a>
				<div style="float:right;text-align:right">
			</c:otherwise>
		</c:choose>
		
	</form:form>
</nav>


