package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.ArticleDAO;
import com.mdcp.mbc.model.Article;

public class ArticleServiceImpl implements ArticleService {

	private ArticleDAO ArticleDAOobj;

	public void setArticleDAO(ArticleDAO ArticleDAO) {

		this.ArticleDAOobj = ArticleDAO;
	}

	@Override
	@Transactional
	public void addArticle(Article p) {
		// TODO Auto-generated method stub
		this.ArticleDAOobj.addArticle(p);
	}

	@Override
	@Transactional
	public void updateArticle(Article p) {
		// TODO Auto-generated method stub
		this.ArticleDAOobj.updateArticle(p);
	}

	@Override
	@Transactional
	public List<Article> listArticles() {
		// TODO Auto-generated method stub
		return this.ArticleDAOobj.listArticles();
	}

	@Override
	@Transactional
	public Article getArticleById(int id) {
		// TODO Auto-generated method stub
		return this.ArticleDAOobj.getArticleById(id);
	}

	@Override
	@Transactional
	public void removeArticle(int id) {
		// TODO Auto-generated method stub
		this.ArticleDAOobj.removeArticle(id);
	}

}
