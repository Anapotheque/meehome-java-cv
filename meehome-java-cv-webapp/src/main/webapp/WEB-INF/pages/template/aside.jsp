<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

Menu
<hr/>
<c:choose>
	<c:when test="${not empty userAuthentificated.nom}">
		
		<script>$(function(){$("#accordion").accordion({heightStyle:"content",collapsible:true});});</script>
		<div id="accordion">
		
			<h3>Creation CV</h3>
			<div>
				<ul>
					<li><a href="<c:url value='/cv' />">Mon CV</a></li>
				</ul>
			</div>
			
			<h3>Mon compte</h3>
			<div>
				<ul>
					<li><a href="<c:url value='/accueil/updateUser' />">modifier mon compte</a></li>
					<li><a href="<c:url value='/deconnexion' />">déconnexion</a></li>
				</ul>
			</div>
			
			<h3>Divers</h3>
			<div>
				<ul>
					<li><a href="#">modifier mon compte</a></li>
					<li><a href="#">modifier mon compte</a></li>
				</ul>
			</div>
		</div>
		
	</c:when>
	<c:otherwise>
		Pas encore de compte ? 
		<a href="<c:url value='/accueil/inscription' />" class="awesome">inscription</a>
	</c:otherwise>
</c:choose>