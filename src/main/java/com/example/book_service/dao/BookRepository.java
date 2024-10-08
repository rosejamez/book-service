package com.example.book_service.dao;

import com.example.book_service.model.Book;
import org.hibernate.event.service.spi.JpaBootstrapSensitive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
