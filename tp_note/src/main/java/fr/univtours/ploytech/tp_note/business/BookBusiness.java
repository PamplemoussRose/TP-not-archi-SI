package fr.univtours.ploytech.tp_note.business;

import java.util.List;

import fr.univtours.ploytech.tp_note.model.BookBean;

public interface BookBusiness {

    public List<BookBean> getBookList();

    public void insertBook(BookBean note);

    public void updateBook(BookBean result);

    public void deleteBook(BookBean note);

    // AJOUTER LES REGLES DE GESTION
}
