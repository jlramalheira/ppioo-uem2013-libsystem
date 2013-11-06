/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.DaoPerfil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Perfil;
import util.Message;

/**
 *
 * @author joao
 */
@WebServlet(name = "perfil", urlPatterns = {"/perfil"})
public class ServletPerfil extends HttpServlet {
    private ArrayList<Message> messages;
    private RequestDispatcher dispatcher;
    private String action;
    private DaoPerfil daoPerfil;
    private Perfil perfil;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        action = request.getParameter("action");
        if (action == null) {
            response.sendError(404);
        } else {
            switch (action) {
                case "create":
                    break;
                case "update":
                    break;
                case "delete":
                    break;
                case "view":
                    break;
                default:
                    response.sendError(404);
            }
        }        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        action = request.getParameter("action");
        if (action == null) {
            response.sendError(404);
        } else {
            switch (action) {
                case "create":
                    break;
                case "update":
                    break;
                case "delete":
                    break;
                case "view":
                    break;
                default:
                    response.sendError(404);
            }
        }        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
