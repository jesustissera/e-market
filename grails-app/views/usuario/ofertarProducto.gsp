<html>
<head><title>Negociacion</title>
<g:javascript library="prototype" />
<r:layoutResources/>

</head>

<body>

	<g:formRemote url="[action: 'mostrarOferta']" update="misOfertas" name="lista">
		<textarea name="CampoOferta" cols="50" rows="4"></textarea>
		
		<input type="submit" value="Ofertar"></input>
	</g:formRemote>
	
	<div id="misOfertas">
		<g:render template = "mostrarOfertaTemplate" collection="${misOfertas}" var="CampoOferta" />
		
</div>

<r:layoutResources/> 
</body>
</html>