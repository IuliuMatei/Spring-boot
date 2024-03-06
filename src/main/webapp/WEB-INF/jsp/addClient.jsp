<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pacienti</title>
</head>
<body>


<div id="add">
<h1> Adauga pacient </h1>
<form action="/users/add" method="post">
    <table>
        <tr>
            <td> Id Client: </td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td> Nume Client: </td>
            <td><input type="text" name="nume"></td>
        </tr>
        <tr>
            <td> Prenume Client: </td>
            <td><input type="text" name="prenume"></td>
        </tr>
        <tr>
            <td> Adresa Client: </td>
            <td><input type="text" name="adresa"></td>
        </tr>
        <tr>
            <td> Judet Client: </td>
            <td><input type="text" name="judet"></td>
        </tr>
        <tr>
            <td> Cnp Client: </td>
            <td><input type="text" name="cnp"></td>
        </tr>
        <tr>
            <td><input type="submit" name="adaugaClient" value="Submit"></td>
        </tr>
    </table>
</form>
</div>

<br>
<a href="/index"><b>Home</b></a>
</body>
</html>
