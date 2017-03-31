package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.Article;

public interface ArticleService {
	public void addArticle(Article p);
	public void updateArticle(Article p);
	public List<Article> listArticles();
	public Article getArticleById(int id);
	public void removeArticle(int id);
}
