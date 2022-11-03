<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/simple.css">
</head>
<body>
	<p style="color:red">${redirectMessage}</p>
	
	<form action="login" method="post">
		<fieldset><legend>Logg Inn</legend>
		
			Mobiltelefon: <input type="text" name="	Telefonnummer"/><br>
		
			Passord: <input type="password" name="	passord"/><br>
			<input type="submit" value="Logg inn"/>
			
		</fieldset>
	</form>
</body>
</html>