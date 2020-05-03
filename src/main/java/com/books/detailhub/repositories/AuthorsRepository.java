package com.books.detailhub.repositories;

import com.books.detailhub.models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorsRepository extends JpaRepository<Authors,Integer> {
    @Query(value = "select author_id from authors where author_name = ?1", nativeQuery = true)
    Integer findAuthor_id(String name);

    @Query(value="update authors set author_name=?1 where author_id=?2", nativeQuery = true)
    void updateAuthor(String name,int id);
}
