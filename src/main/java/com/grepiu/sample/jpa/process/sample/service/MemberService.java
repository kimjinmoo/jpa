package com.grepiu.sample.jpa.process.sample.service;

import com.grepiu.sample.jpa.process.sample.entity.Member;
import com.grepiu.sample.jpa.process.sample.repository.MemberRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

  @Autowired
  private MemberRepository memberRepository;

  /**
   *
   * 데이터를 저장한다.
   *
   * @param member
   * @return Member 객체
   */
  public Member addMember(Member member) {
    member.setCreateDate(new Date());
    return memberRepository.save(member);
  }


  /**
   *
   * 데이터를 불러온다.
   *
   * @return List<Member> 객체
   */
  public List<Member> getMembers() {
    return memberRepository.findAll();
  }

  /**
   *
   * 맴버를 수정한다.
   *
   * @param id ID
   * @param updateMember 수정될 맴버 객체
   * @return Member 객체
   */
  public Member updateMember(Long id, Member updateMember) {
    Member member = memberRepository.findById(id).orElseThrow(()-> new RuntimeException("유저가 존재하지 않습니다."));
    member.setName(updateMember.getName());
    member.setEmail(updateMember.getEmail());
    member.setModifyDate(new Date());
    return memberRepository.save(member);
  }

  /**
   *
   * 맴버를 삭제한다.
   *
   * @param id
   */
  public void deleteMember(Long id) {
    memberRepository.deleteById(id);
  }

}
