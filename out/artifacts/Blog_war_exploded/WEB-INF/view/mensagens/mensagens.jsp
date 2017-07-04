<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- LOGIN -->
<c:if test="${status == 'ERRO_LOGIN'}">
    <div class="alert alert-danger" role="alert">
        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        <span class="fa fa-close"></span> <strong>Opa! &nbsp</strong> Login ou senha incorreto(s).
    </div>
</c:if>
<c:if test="${status == 'ERRO_INATIVA'}">
    <div class="alert alert-danger" role="alert">
        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        <span class="fa fa-close"></span> <strong>Opa! &nbsp</strong> Sua conta esta inativa.
    </div>
</c:if>


<c:if test="${status == 'comissoes'}">
    <div class="alert alert-success" role="alert">
        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        <span class="glyphicon glyphicon-ok"></span> <strong>Ok! &nbsp</strong> Proponente indicado com sucesso.
    </div>
</c:if>