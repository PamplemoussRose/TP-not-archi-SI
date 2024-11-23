package fr.univtours.ploytech.tp_note.servlet;

import java.io.IOException;
import java.util.List;

import fr.univtours.ploytech.tp_note.business.BookBusiness;
import fr.univtours.ploytech.tp_note.model.BookBean;
import jakarta.inject.Inject;
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
    @Inject
    private BookBusiness business;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<BookBean> list = business.getBookList();
        for (BookBean bookBean : list) {
            System.out.println(bookBean.toString());
        }
        request.setAttribute("BOOK_LIST", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("bookList.jsp");
        dispatcher.forward(request, response);
    }
}