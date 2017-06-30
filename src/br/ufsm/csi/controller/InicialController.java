package br.ufsm.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// EXIBIR ÚLTIMOS 10 POSTS
// EXIBIR POSTS ANTIGOS: MOSTRA TODOS
// VISUALIZAR POST COMPLETO, COMENTARIOS OU COMENTAR

@Controller
public class InicialController {

    @RequestMapping(value = "paginaInicial")
    public String paginaInicial() {
        return "pagina-inicial/pagina-inicial";
    }

}
