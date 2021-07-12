<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actividad obligatoria</h1>
        <form action="Servlet" method="post">
            Titulo:
            <input type="text" name="nombre">
            <input type="submit" value="enviar"><br><br>
            Curso:
            <input type="text" name="apellido">
            <input type="submit" value="enviar"><br><br>
            Comision:
            <input type="text" name="comision">
            <input type="submit" value="enviar"><br><br>
            Descripcion:
            <input type="text" name="descripcion">
            <input type="submit" value="enviar">
        </form>
    </body>
</html>
