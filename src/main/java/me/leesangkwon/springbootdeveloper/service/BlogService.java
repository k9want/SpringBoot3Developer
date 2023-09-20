package me.leesangkwon.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.leesangkwon.springbootdeveloper.domain.Article;
import me.leesangkwon.springbootdeveloper.dto.AddArticleRequest;
import me.leesangkwon.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

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
}
