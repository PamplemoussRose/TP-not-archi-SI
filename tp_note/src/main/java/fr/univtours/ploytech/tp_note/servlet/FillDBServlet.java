package fr.univtours.ploytech.tp_note.servlet;

import java.io.IOException;

import fr.univtours.ploytech.tp_note.business.BookBusiness;
import fr.univtours.ploytech.tp_note.model.BookBean;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "fillDBServlet", urlPatterns = { "/fillDB" })
public class FillDBServlet extends HttpServlet {

    @Inject
    private BookBusiness bookBusiness;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Ajout de livres.
        BookBean livre1 = new BookBean();
        livre1.setTitle("Le temps des tempetes");
        livre1.setAuthor("N. Sarco");
        livre1.setFree(true);
        bookBusiness.insertBook(livre1);

        BookBean livre2 = new BookBean();
        livre1.setTitle("Le temps des");
        livre1.setAuthor("N. Sarco");
        livre1.setFree(true);
        bookBusiness.insertBook(livre2);

        BookBean livre3 = new BookBean();
        livre1.setTitle("Le temps");
        livre1.setAuthor("N. Sarco");
        livre1.setFree(true);
        bookBusiness.insertBook(livre3);

        BookBean livre4 = new BookBean();
        livre1.setTitle("Le");
        livre1.setAuthor("N. Sarco");
        livre1.setFree(false);
        bookBusiness.insertBook(livre4);
    }
}
