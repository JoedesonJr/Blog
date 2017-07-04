package br.ufsm.csi.DAO;

import br.ufsm.csi.model.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.security.MessageDigest;

@Repository
public class HibernateDAO {

    @Autowired
    private SessionFactory sessionFactory;

    // INSERT
    public void insert(Object object) {
        sessionFactory.getCurrentSession().save(object);
    }

    // DELETE
    public void delete(Object object) {
        sessionFactory.getCurrentSession().delete(object);
    }

    // UPDATE
    public void update(Object object) {
        sessionFactory.getCurrentSession().update(object);
    }

    // AUTENTICAR USUARIO
    public Usuario autenticarUsuario(Usuario usuario) throws Exception {

        DetachedCriteria criteria = DetachedCriteria.forClass(Usuario.class);
        // WHERE
        criteria.add(Restrictions.eq("login", usuario.getLogin()));
        criteria.add(Restrictions.eq("senha", MessageDigest.getInstance("SHA-256")
            .digest(usuario.getSenha())));

        return (Usuario) criteria.getExecutableCriteria(
            sessionFactory.getCurrentSession()).uniqueResult();
    }



}
