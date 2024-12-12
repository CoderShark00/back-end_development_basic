package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ArticleForm {
    private Long id;
    private String title; //제목을 받을 필드
    private String content; //내용을 받을 필드

    public Article toEntity() {
        return new Article(id, title, content);
    }

    public static ArticleForm createArticledto(Article article){
        return new ArticleForm(
                article.getId(),
                article.getTitle(),
                article.getContent()
        );
    }
}

