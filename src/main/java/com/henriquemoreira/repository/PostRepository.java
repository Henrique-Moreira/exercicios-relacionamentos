package com.henriquemoreira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquemoreira.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
