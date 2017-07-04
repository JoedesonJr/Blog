package br.ufsm.csi.Interceptor;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller) throws Exception {

        String uri = request.getRequestURI();

        // METODOS PUBLICOS
        if(uri.endsWith("paginaInicial") || uri.endsWith("login") || uri.contains("resources")) {
            return true;
        }

        // METODOS DO USUARIO ADM
        else if(request.getSession().getAttribute("usuarioADM") != null) {
            if(uri.endsWith("administrador")) {
                return true;
            }
        }

        // METODOS DO USUARIO LOGADO
        else if(request.getSession().getAttribute("usuarioLogado") != null) {

        }

        response.sendRedirect("paginaInicial");

        return false;
    }
}
