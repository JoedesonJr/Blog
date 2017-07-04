<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- MODAL LOGIN -->
<div class="modal fade" id="acessarConta" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <!-- LOGIN -->
        <div class="modal-content">
            <!-- TITULO -->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Acesse sua conta&nbsp; <i class="fa fa-sign-in"></i></h4>
            </div>

            <!-- FORM -->
            <div class="modal-body">
                <br>
                <form class="row" action="login" method="post" autocomplete="off">
                    <div class="col-md-offset-2 col-md-8 col-md-offset-2">
                        <!-- INPUT LOGIN -->
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-key"></i></span>
                            <input type="text" class="form-control" name="login" placeholder="Login" required>
                        </div>
                        <br>
                        <!-- INPUT  SENHA -->
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-asterisk"></i></span>
                            <input type="password" class="form-control" name="senha" placeholder="Senha" required>
                        </div>
                        <hr>

                        <button type="submit" class="btn btn-primary">Acessar Conta</button>
                    </div>
                </form>
                <br>
            </div>   <!-- ./form -->
        </div>   <!-- ./login -->
    </div>
</div>   <!-- ./modal login -->

