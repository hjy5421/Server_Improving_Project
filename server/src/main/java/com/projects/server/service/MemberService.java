package com.projects.server.service;

import com.projects.server.domain.Member;
import com.projects.server.repository.MemberRepository;
import com.projects.server.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service //스프링 컨테이너에 등록
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원가입
     */
    public Long join(Member member){
        //중복 회원 검증
       /* Optional<Member> result = memberRepository.findByName(member.getName());
        result.ifPresent( m->{
            throw new IllegalStateException("이미 존재하는 회원입니다."); //Optional이기 때문에 가능
        });*/
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
