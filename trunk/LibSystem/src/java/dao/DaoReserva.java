/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.Dao.em;
import java.util.List;
import model.Obra;
import model.Reserva;
import model.Usuario;

/**
 *
 * @author joao
 */
public class DaoReserva extends Dao<Reserva> {

    public DaoReserva() {
        super(Reserva.class);
    }

    public List<Reserva> listByUsuario(Usuario usuario) {
        criteria = newCriteria();
        return criteria
                .andEquals("usuario", usuario)
                .getResultList();
    }
    
    public List<Reserva> listByObra(Obra obra) {
        criteria = newCriteria();
        return criteria
                .andEquals("obra", obra)
                .getResultList();
    }
    
    public Reserva getNextReserva(Obra obra){
        criteria = newCriteria();
        List<Reserva> reservas = criteria
                .andEquals("obra", obra)
                .orderByAsc("diaReserva")
                .getResultList();
        if (reservas.size() > 2){
            return reservas.get(1);
        }
        return null;
    }

    public List<Reserva> listByUsuarioObra(Usuario usuario, Obra obra) {
        criteria = newCriteria();
        return criteria
                .andEquals("usuario", usuario)
                .andEquals("obra", obra)
                .getResultList();
    }
    
    public List<Reserva> listByTituloobra(String titulo) {
        return em.createQuery("SELECT r FROM Reserva r WHERE r.obra.titulo LIKE '%"+titulo+"%'").getResultList();
    }
    public List<Reserva> listByTituloobraStatus(String titulo, int status) {
        return em.createQuery("SELECT r FROM Reserva r WHERE r.obra.titulo LIKE '%"+titulo+"%' AND r.status = "+status).getResultList();
    }
}