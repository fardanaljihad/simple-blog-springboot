package com.blog.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.vo.Comment;

@Repository("CommentJpaRepository")
public interface CommentJpaRepository extends JpaRepository<Comment, Serializable> {

	List<Comment> findAllByPostIdOrderByRegDateDesc(Long postId);
	Comment findOneById(Long id);
	List<Comment> findAllByPostIdAndCommentContainingOrderByRegDateDesc(Long postId, String query);
}
