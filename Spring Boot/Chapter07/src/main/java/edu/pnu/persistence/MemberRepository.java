package edu.pnu.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pnu.config.domain.Member;

// Member Table에 CRUD를 위한 Interface
public interface MemberRepository extends JpaRepository<Member, String> {

}
