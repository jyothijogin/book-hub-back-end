package com.books.detailhub.repositories;

import com.books.detailhub.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Books,Integer> {
    @Query(value = "select book_id,title,genre,rating,description,publisher_id from books where book_id = ?1",nativeQuery = true)
    Books findBook(int id);

    @Query(value = "update books set title=?1,genre=?2,rating=?3,description=?4 where book_id=?5", nativeQuery = true)
     void updateBook(String title,String genre,Float rating,String description,int book_id);
}
