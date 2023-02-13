package com.example.book_library.reponsitory;

import com.example.book_library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookReponsitory extends JpaRepository<Book,Integer> {
}
