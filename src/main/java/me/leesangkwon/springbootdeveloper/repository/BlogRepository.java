package me.leesangkwon.springbootdeveloper.repository;

import me.leesangkwon.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
