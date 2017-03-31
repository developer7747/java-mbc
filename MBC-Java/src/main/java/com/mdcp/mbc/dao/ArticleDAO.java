package com.mdcp.mbc.dao;

import java.util.List;

import com.mdcp.mbc.model.Article;

public interface ArticleDAO {
	public void addArticle(Article p);
	public void updateArticle(Article p);
	public List<Article> listArticles();
	public Article getArticleById(int id);
	public void removeArticle(int id);
}
