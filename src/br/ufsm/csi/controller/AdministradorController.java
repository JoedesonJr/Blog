package br.ufsm.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// CADASTRAR USUÁRIO
// REMOVER OU ALTERAR (QUALQUER) POSTS

@Controller
public class AdministradorController {

    @RequestMapping(value = "administrador", method = RequestMethod.GET)
    public String paginaADM() {
        return "pagina-administrador/pagina-administrador";
    }

}
