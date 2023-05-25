<%-- 
    Document   : NuevaPromocion
    Created on : 09-feb-2017, 9:56:15
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="formulario" method="get" action="PromocionServlet.do">
        <table border="1">
            <tr>
                <th colspan="2">Insertar nueva Promocion</th>
            </tr>
            <tr>
                <td>Codigo Promoción:</td>
                <td><input type="text" name="cod-promocion"></td>
            </tr>
            <tr>
                <td>Nombre Promoción:</td>
                <td><input type="text" name="nombre"></td>
            </tr>
            <tr>
                <td>Descripción:</td>
                <td><textarea name="descripcion"></textarea></td>
            </tr>
            <tr>
                <td>Provincia:</td>
                <td><input type="text" name="provincia"></td>
            </tr>
            <tr>
                <td>Foto:</td>
                <td><input type="text" name="foto"></td>
            </tr>
            <tr>
                <td><button>Insertar</button></td>
            </tr>
        </table>
        </form>
    </body>
</html>
