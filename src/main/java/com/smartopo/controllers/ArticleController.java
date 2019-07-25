package com.smartopo.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartopo.DAO.ArticleDAO;
import com.smartopo.entities.Article;

@RestController
@RequestMapping(value = "/articles/")

public class ArticleController {


		@Autowired
		private ArticleDAO articleDAO;
		
		@GetMapping(value = "all")
		public List<Article> getArticles(){
			return articleDAO.findAll();
		}
		
		@GetMapping(value = "all/{id}")
		public Optional<Article> getArticle(@PathVariable Long id) {
			return articleDAO.findById(id);
		} 
		@DeleteMapping(value = "delete/{id}")
		public boolean deleteArticle(@PathVariable Long id) {
			articleDAO.deleteById(id);
			return true;
		}
		@PutMapping(value = "update")
		public Article updateArticle(@RequestBody Article article) {
			return articleDAO.save(article);
		}
		@PostMapping(value = "new")
		public Article createArticle(@RequestBody Article article) {
			return articleDAO.save(article);
		}
	}


