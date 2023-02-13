package com.example.book_library.service;


import com.example.book_library.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();

    Book findById(int id);
}
