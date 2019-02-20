package com.grepiu.sample.jpa.process.sample.controller;

import com.grepiu.sample.jpa.process.sample.entity.Member;
import com.grepiu.sample.jpa.process.sample.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/v1"})
public class MemberController {

  @Autowired
  private MemberService memberService;

  @PostMapping("/members")
  public ResponseEntity<Member> addMember(@RequestBody Member member) {
    return new ResponseEntity<>(memberService.addMember(member), HttpStatus.CREATED);
  }

  @GetMapping("/members")
  public List<Member> getAllMembers() {
    return memberService.getMembers();
  }

  @PutMapping("/members/{id}")
  public ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member member) {
    return new ResponseEntity<>(memberService.updateMember(id, member), HttpStatus.OK);
  }

  @DeleteMapping("/members/{id}")
  public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
    memberService.deleteMember(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
