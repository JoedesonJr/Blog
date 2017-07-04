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
                        Acesse sua conta&nbsp; <i class="fa fa-sign-in"></i>
                    </a> &nbsp;
                </div>   <!-- ./acessar conta -->
            </div>
        </nav>   <!-- ./menu superior -->

        <br>   <!-- MENSAGENS -->
        <c:if test="${not empty status}">
            <div class="container">
                <c:import url="../mensagens/mensagens.jsp" />
            </div>
        </c:if>
        <br>

        <!-- POSTS -->
        <div class="container">
            <!-- ULTIMOS POSTS -->
            <div class="well">
                <strong class="text-muted lead" style="font-size: 20px">
                    &nbsp;<i class="fa fa-angle-right"></i>&nbsp; Últimos Posts
                    <i class="fa fa-calendar pull-right"></i>
                </strong>
            </div>
            <br>   <!-- ./ultimos posts -->

            <!-- POST 1 -->
            <hr>
            <div class="media container" style="border-left:4px outset #ff7e1f; border-radius: 3px;">
                <div class="media-body text-justify">
                    <div style="margin-left: 1%">
                        <h4 class="media-heading">Media heading</h4>
                        <span class="text-muted small">
                                <span class="fa fa-user"></span> Usu·rio, &nbsp;<i class="fa fa-clock-o"></i> 23 de Julho, 2017 &nbsp;&nbsp; <i class="fa fa-comment-o"></i> 3
                            </span>
                        <br><br>
                        Cras sit amet nibh libero, cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
                        in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
                        <br><br>
                        <a href="">Leia mais ...</a>
                    </div>
                </div>
            </div>
            <hr>

            <!-- POST 2 -->
            <hr>
            <div class="media container" style="border-left:4px outset #ff7e1f;">
                <div class="media-body text-justify">
                    <div style="margin-left: 1%">
                        <h4 class="media-heading">Media heading</h4>
                        <span class="text-muted small">
                                <span class="fa fa-user"></span> Usu·rio, &nbsp;<i class="fa fa-clock-o"></i> 23 de Julho, 2017 &nbsp;&nbsp; <i class="fa fa-comment-o"></i> 3
                            </span>
                        <br><br>
                        Cras sit amet nibh libero, cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
                        in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
                        <br><br>
                        <a href="">Leia mais ...</a>
                    </div>
                </div>
            </div>
            <hr>
            <br>
        </div>    <!-- ./posts -->

        <!-- MODAL LOGIN -->
        <c:import url="modal-login.jsp"/>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
    </body>
</html>
