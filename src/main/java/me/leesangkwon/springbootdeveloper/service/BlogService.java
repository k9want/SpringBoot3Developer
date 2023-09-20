package me.leesangkwon.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.leesangkwon.springbootdeveloper.domain.Article;
import me.leesangkwon.springbootdeveloper.dto.AddArticleRequest;
import me.leesangkwon.springbootdeveloper.dto.UpdateArticleRequest;
import me.leesangkwon.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service // 빈으로 등록
public class BlogService {
    private final BlogRepository blogRepository;


//    public BlogService(BlogRepository blogRepository) {
//        this.blogRepository = blogRepository;
//    } -> @RequiredArgsConstructor로 대체

    //블로그 글 추가하는 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
