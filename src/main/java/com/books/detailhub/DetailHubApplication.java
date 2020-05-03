package com.books.detailhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import java.util.Map;

@SpringBootApplication
public class DetailHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailHubApplication.class, args);
	}
}
