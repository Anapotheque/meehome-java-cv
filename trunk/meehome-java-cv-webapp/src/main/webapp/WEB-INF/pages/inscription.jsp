<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form method="POST" cssClass="formulaire" commandName="user">
	
	Formulaire d'insciption
	<hr/>
	<i>Veuillez renseigner l'ensemble de ses champs afin de valider votre inscription</i><br/><br/>

	<form:errors path="*" cssClass="ui-state-error ui-corner-all error" element="div" />

	<label>Email</label>
	<form:input path="email" placeholder="email" />
	<br/><br/>
	
	<label>Nom</label>
	<form:input path="nom" placeholder="nom" />
	<br/><br/>
	
	<label>Prenom</label>
	<form:input path="prenom" placeholder="prenom" />
	<br/><br/>
	
	<label>Password</label>
	<form:password path="password" placeholder="password" />
	<br/><br/>
	
	<a href="<c:url value='/accueil/' />">retour</a>
	<button id="buttonInscription">inscription</button>
	
</form:form>