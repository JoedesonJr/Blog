package br.ufsm.csi.controller;

import br.ufsm.csi.DAO.HibernateDAO;
import br.ufsm.csi.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

// LOGIN
// LOGOUT

@Controller
public class LoginController {

    @Autowired
    private HibernateDAO hibernateDAO;

    @Transactional
    @RequestMapping("login")
    public String login(Usuario usuario, HttpSession session, RedirectAttributes attributes,
        HttpServletRequest request) throws Exception {

        Usuario usuarioAutenticado = hibernateDAO.autenticarUsuario(usuario);

        if(usuarioAutenticado != null) {
            // CONTA ATIVA
            if(usuarioAutenticado.isAtivo()) {

                // INVALIDADE A SESSÃO ATUAL E GERA UMA NOVA
                session.invalidate();
                session = request.getSession();

                Usuario usuarioLogado = new Usuario();
                    usuarioLogado.setIdUsuario(usuarioAutenticado.getIdUsuario());
                    usuarioLogado.setNome(usuarioAutenticado.getNome());

                // USUARIO ADMINISTRADOR
                if(usuarioAutenticado.isAdministrador()) {
                    session.setAttribute("usuarioADM", usuarioLogado);
                    return "redirect:administrador";
                }
                // USUARIO COMUM
                else {
                    session.setAttribute("usuarioLogado", usuarioLogado);
                }
            }
            // CONTA INATIVA
            else { attributes.addFlashAttribute("status", "ERRO_INATIVA"); }
        }
        // USUARIO NAO ENCONTRARO
        else { attributes.addFlashAttribute("status", "ERRO_LOGIN"); }

        return "redirect:paginaInicial";
    }

}
