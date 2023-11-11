package com.app.dao;

import com.app.model.Book;

import java.util.List;

public interface IBookStoreDAO {

    List<Book> getBooks();
    Book getBook(int bookId);
    Book createBook(Book book);
    Book updateBook(int bookId,Book book);
    boolean deleteBook(int bookId);
}
