package fr.univtours.ploytech.tp_note.dao;

import fr.univtours.ploytech.tp_note.model.BookBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class BookDaoImpl implements BookDao{

    @PersistenceContext(unitName = "TpNote1")
    private EntityManager em;

    @Override
    public BookBean getBook(Integer id){
        return em.find(BookBean.class, id);
    }

    @Override
    public void insertBook(BookBean student) {
        em.persist(student);
    }

    @Override
    public void updateBook(BookBean student) {
        //String sql = "update STUDENT_JPA set NAME = "+student.getName()+", FIRST_NAME = "+student.getFirstName()+" where STUDENT_JPA.ID_STUDENT = "+student.getIdStudent()+";";
        //em.createNativeQuery(sql);
    }

}
