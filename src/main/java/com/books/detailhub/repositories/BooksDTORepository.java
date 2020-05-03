package com.books.detailhub.repositories;

import com.books.detailhub.models.Authors;
import com.books.detailhub.models.Books;
import com.books.detailhub.models.BooksDTO;
import com.books.detailhub.models.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksDTORepository extends JpaRepository<Books,Integer> {
}
