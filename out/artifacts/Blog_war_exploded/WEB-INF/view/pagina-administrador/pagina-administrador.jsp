<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Página Inicial</title>

        <!-- BOOTSTRAP, ICONS -->
        <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
        <link href="<c:url value='/resources/icons/css/font-awesome.min.css'/>" rel="stylesheet">
    </head>
    <body>
        <!-- MENU SUPERIOR -->
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- TITULO -->
                <div class="navbar-header">
                    &nbsp; <a class="navbar-brand" href><i class="fa fa-terminal"></i>&nbsp; Blog Segurança</a>
                </div>

                <!-- ACESSAR CONTA -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <a class="navbar-brand navbar-right text-primary" href data-toggle="modal" data-target="#acessarConta">
                        ${usuarioADM.nome}
                    </a> &nbsp;
                </div>   <!-- ./acessar conta -->
            </div>
        </nav>   <!-- ./menu superior -->


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
    </body>
</html>
