package com.example.myapplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class MyModel {
    public String status;
    public int totalResults;
    Article article;


    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    public class Root{
        public String status;
        public int totalResults;
        public ArrayList<Article> articles;

        public Root(String status, int totalResults, ArrayList<Article> articles) {
            this.status = status;
            this.totalResults = totalResults;
            this.articles = articles;
        }

        public Root() {
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public Collection<? extends Article> getArticles() {
            return articles;
        }

        public void setArticles(ArrayList<Article> articles) {
            this.articles = articles;
        }
    }

    public static class Article{
        public source source;
        public String author;
        public String title;
        public String description;
        public String url;
        public String urlToImage;
        public Date publishedAt;
        public String content;

        public MyModel.source getSource() {
            return source;
        }

        public void setSource(MyModel.source source) {
            this.source = source;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public Date getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(Date publishedAt) {
            this.publishedAt = publishedAt;
        }



        public void setContent(String content) {
            this.content = content;
        }
    }


    public static class source {




        public String id;
        public String name;

        public source(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
