package fr.univtours.ploytech.tp_note.business;

import java.util.List;

import fr.univtours.ploytech.tp_note.dao.BookDao;
import fr.univtours.ploytech.tp_note.model.BookBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class BookBusinessImpl implements BookBusiness {
    // Dépendances vers les différents DAO utiles pour ce service métier.
    @Inject
    private BookDao bookDao;

    @Override
    public List<BookBean> getBookList() {
        System.out.println("Book business");
        return this.bookDao.getBookList();
    }

    
    @Override
    public void insertBook(BookBean book) {
        this.bookDao.insertBook(book);
    } 

    @Override
    public void updateBook(BookBean book) {
        this.bookDao.updateBook(book);
    }

    /*
    @Override
    public void deleteBook(BookBean note) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBook'");
    }
    */

    @Override
    public int nbBookEmpruntes() {
        List<BookBean> liste = this.bookDao.getBookRes();
        return liste.size();
    }

    

    // AJOUTER LES REGLES DE GESTION
}
