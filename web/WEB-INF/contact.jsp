<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <body>
        <h1>Datos</h1>
        <s:form action="add" method="post">
            <s:fielderror/>
            <s:textfield name="contact.Nombre" label="Nombre"/>
            <s:textfield name="contact.Apellido" label="Apellido"/>
            <s:textfield name="contact.Provincia" label="Provincia"/>
            <s:textfield name="contact.Distrito" label="Distrito"/>
            <s:textfield name="contact.website" label="Homepage"/>
            <s:textfield name="contact.Nacimiento" label="Nacimiento"/>  
            <s:textfield name="captcha" label="Captcha"/>

            <s:submit value="Add Contact" />
        </s:form>
        <img src="captcha.jpg" border="0">
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Provincia</th>
                <th>Distrito</th>
                <th>Nacimiento</th>
                <th>Homepage</th>
                <th>Delete</th>
            </tr>
            <s:iterator value="contactos" status="status">
            <tr>
                <td><s:property value="nombre"/> <s:property value="apellido"/> </td>
                <td><s:property value="provincia"/></td>
                <td><s:property value="distrito"/></td>
                <td><s:property value="nacimiento"/></td>
                <td><a href="<s:property value="website"/>">link</a></td>
                <td><s:property value="#status.index"/></td>
            </tr>
            </s:iterator>
        </table>
            
    </body>
</html>
