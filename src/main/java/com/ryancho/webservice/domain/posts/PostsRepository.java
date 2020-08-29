package com.ryancho.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
//객체 타입, 아이디값 타입 <-데이터베이스 paRepository<Entity클래스, PK타입>
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
