package com.grepiu.sample.jpa.process.sample.controller;

import com.grepiu.sample.jpa.process.sample.entity.Member;
import com.grepiu.sample.jpa.process.sample.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/v1"})
public class MemberController {

  @Autowired
  private MemberService memberService;

  @GetMapping("/members")
  public List<Member> getAllMembers() {
    return memberService.getMembers();
  }
}
