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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBookList'");
    }

    @Override
    public void insertBook(BookBean note) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertBook'");
    }

    @Override
    public void updateBook(BookBean result) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    }

    @Override
    public void deleteBook(BookBean note) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBook'");
    }

    // AJOUTER LES REGLES DE GESTION
}
