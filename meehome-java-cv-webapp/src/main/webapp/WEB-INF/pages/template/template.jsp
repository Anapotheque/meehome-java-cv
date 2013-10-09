<!DOCTYPE HTML>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <tiles:insertAttribute name="meta" />
    </head>
    <body>
    	<div class="wrapper ui-corner-all">
    	    <header class="ui-corner-all">
	            <tiles:insertAttribute name="header" />
	        </header>
	        <nav class="ui-corner-all">
	            <tiles:insertAttribute name="navigation" />
	        </nav>
	        <nav class="ui-corner-all">
	            <tiles:insertAttribute name="breadcrumbs" />
	        </nav>
	        <div class="body">
	            <aside class="ui-corner-all">
	            	<tiles:insertAttribute name="aside" />
	            </aside>
	            <section class="ui-corner-all">
	            	<tiles:insertAttribute name="section" />
	            </section>
	        </div>
	        <div class="clear"></div>
	        <footer class="ui-corner-all">
	            <tiles:insertAttribute name="footer" />
	        </footer>
        </div>
        
		<!-- JAVASCRIPT -->
		<script src="<c:url value='/resources/js/jquery-1.9.1.js'/>"></script>
		<script src="<c:url value='/resources/js/jquery-ui-1.10.3.custom.js'/>"></script>
		<script src="<c:url value='/resources/bootstrap/js/bootstrap.min.js'/>"></script>
		
		<script>
			$(function(){$("#buttonConnexion").button();});
			$(function(){$("#buttonInscription").button();});
		</script>
        
    </body>
</html>