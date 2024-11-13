package fr.univtours.ploytech.tp_note.servlet;

import java.io.IOException;
import java.util.List;

import fr.univtours.ploytech.tp_note.business.BookBusiness;
import fr.univtours.ploytech.tp_note.business.BookBusinessImpl;
import fr.univtours.ploytech.tp_note.model.BookBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "homeServlet", urlPatterns = { "/home" })
public class HomeServlet extends HttpServlet {
    // Dépendances vers les différents services métiers utiles.
    // Il n'y en a qu'un seul ici.
    private BookBusiness business;

    @Override
    public void init() throws ServletException {
        // Instanciation de ces (cette ici) dépendances.
        this.business = new BookBusinessImpl();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<BookBean> list = this.business.getBookList();
        req.setAttribute("BOOK_LIST", list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("bookList.jsp");
        dispatcher.forward(req, res);
    }
}