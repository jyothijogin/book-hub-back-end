package com.books.detailhub.repositories;

import com.books.detailhub.models.Book_Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Deprecated
public interface Book_AuthorsRepository extends JpaRepository<Book_Authors,Integer> {
    @Query(value = "insert into book_authors(book_id, author_id) values (?1 ,?2)", nativeQuery = true)
    void bookauthorInsert(int value1,int value2);
}
