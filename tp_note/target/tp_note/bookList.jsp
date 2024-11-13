<%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Gestion des notes</title>
            <link rel="stylesheet" href="styles.css">
        </head>

        <body>
            <section>
                <h1>Liste des notes</h1>
                <table border=1>
                    <tr style="background-color: lightgray;">
                        <th>Titre</th>
                        <th>Auteur</th>
                        <th>Emprunter/Rendre</th>
                    </tr>
                    <c:forEach items="${requestScope.BOOK_LISTE}" var="book">
                        <tr>
                            <td>${book.getBookBean().title}</td>
                            <td>${{book.getBookBean().auteur}</td>
                            <td>${{book.getBookBean().free}</td>
                        </tr>
                    </c:forEach>
                </table>
            </section>
        </body>
        </html>