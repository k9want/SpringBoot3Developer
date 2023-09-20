package me.leesangkwon.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔티티로 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id // id 필드를 기본키로 지정
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", updatable = false)
    private long id;

    @Column (name = "title", nullable = false)
    private String title;

    @Column (name = "content", nullable = false)
    private String content;



    @Builder // 빌더 패턴으로 객체 생성
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

//    protected Article() {
//        //기본 생성자
//    } -> @NoArgsConstructor로 대체

    // Getter
//    public long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    } -> @Getter로 대체

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
