package fr.univtours.ploytech.tp_note.business;

import java.util.List;

import fr.univtours.ploytech.tp_note.model.BookBean;

public interface BookBusiness {

    public void insertBook(BookBean book);

    public void updateBook(BookBean book);

    //public void deleteBook(BookBean note);

    // AJOUTER LES REGLES DE GESTION
    public int nbBookEmpruntes();
}
