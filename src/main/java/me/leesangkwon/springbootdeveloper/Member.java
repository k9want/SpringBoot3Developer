package me.leesangkwon.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity // name 지정안하면 클래스 이름과 같은 테이블과 매핑
//@Entity (name = "member_list") member_list라는 이름을 가진 테이블과 매핑
public class Member {

    @Id // Long타입의 id 필드를 테이블의 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
