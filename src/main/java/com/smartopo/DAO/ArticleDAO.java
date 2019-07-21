package com.smartopo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartopo.entities.Article;


public interface ArticleDAO extends JpaRepository<Article, Long>{

}
