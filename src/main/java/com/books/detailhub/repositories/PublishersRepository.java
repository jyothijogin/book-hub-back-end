package com.books.detailhub.repositories;

import com.books.detailhub.models.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PublishersRepository extends JpaRepository<Publishers,Integer> {
    @Query(value="update publishers set name=?1 where publisher_id=?2", nativeQuery = true)
    void updatePublisher(String name,int id);
}
