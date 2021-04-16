package com.henriquemoreira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquemoreira.domain.PostComment;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Integer> {

}
