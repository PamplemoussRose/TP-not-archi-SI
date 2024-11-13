package fr.univtours.ploytech.tp_note.dao;

import java.util.List;

import fr.univtours.ploytech.tp_note.model.BookBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class BookDaoImpl implements BookDao {

    @PersistenceContext(unitName = "TpNote1")
    private EntityManager em;

    @Override
    public List<BookBean> getBookList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBookList'");
    }

    @Override
    public BookBean getBook(Integer id) {
        return em.find(BookBean.class, id);
    }

    /*
     * @Override
     * public void insertBook(BookBean student) {
     * em.persist(student);
     * }
    */

    @Override
    public void updateBook(BookBean bookB) {
        String sql = "update book set TITLE = "+bookB.getTitle()+", AUTHOR
            = "+bookB.getAuthor()+",FREE= "+bookB.getFree()" where book.ID 
            = "+bookB.getId()+";";
        em.createNativeQuery(sql);
    }
}
