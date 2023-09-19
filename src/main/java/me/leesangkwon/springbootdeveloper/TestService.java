package me.leesangkwon.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    MemberRepository memeberRepository;

    public List<Member> getAllMembers() {
        return memeberRepository.findAll();
    }
}
