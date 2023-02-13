package com.example.book_library.service;

import com.example.book_library.model.Book;
import com.example.book_library.reponsitory.IBookReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookReponsitory bookReponsitory;

    @Override
    public List<Book> findAll() {
        return bookReponsitory.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookReponsitory.findById(id).get();
    }

}
