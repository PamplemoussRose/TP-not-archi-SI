package fr.univtours.ploytech.tp_note.dao;

import java.util.List;

import fr.univtours.ploytech.tp_note.model.BookBean;

public interface BookDao {
    
    public List<BookBean> getBookList();
    
    public BookBean getBook(Integer id);

    //public void insertBook(BookBean book);

    public void updateBook(BookBean book);
}
