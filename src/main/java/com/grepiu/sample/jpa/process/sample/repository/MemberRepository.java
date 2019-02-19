package com.grepiu.sample.jpa.process.sample.repository;

import com.grepiu.sample.jpa.process.sample.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
