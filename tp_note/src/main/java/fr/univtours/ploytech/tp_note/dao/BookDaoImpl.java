package fr.univtours.ploytech.tp_note.dao;

import java.util.List;

import fr.univtours.ploytech.tp_note.model.BookBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class BookDaoImpl implements BookDao {

    @PersistenceContext(unitName = "TpNote1")
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<BookBean> getBookList() {
        Query requete = em.createNativeQuery("select * from book", BookBean.class);
        return requete.getResultList();
    }

    @Override
    public BookBean getBook(Integer id) {
        return em.find(BookBean.class, id);
    }

    @Override
    public void insertBook(BookBean bookB) {
        // Insertion d'un enregistrement en BDD.
        em.persist(bookB);
    }

    @Override
    public void updateBook(BookBean bookB) {
        String sql = "update book set TITLE = " + bookB.getTitle() + ", AUTHOR= " + bookB.getAuthor() + ",FREE= "
                + bookB.isFree() + " where book.ID = " + bookB.getId() + ";";
        em.createNativeQuery(sql);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<BookBean> getBookRes(){
        Query requete = em.createNativeQuery("select * from book where FREE=1", BookBean.class);
        return requete.getResultList();
    }
    
}
