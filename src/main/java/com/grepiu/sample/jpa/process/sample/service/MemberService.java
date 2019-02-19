package com.grepiu.sample.jpa.process.sample.service;

import com.grepiu.sample.jpa.process.sample.entity.Member;
import com.grepiu.sample.jpa.process.sample.repository.MemberRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

  @Autowired
  private MemberRepository memberRepository;

  /**
   *
   * 데이터를 불러온다.
   *
   * @return List<Member> 객체
   */
  public List<Member> getMembers() {
    return memberRepository.findAll();
  }
}
