package com.blog.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.vo.Post;

@Repository("PostJpaRepository")
public interface PostJpaRepository extends JpaRepository<Post, Serializable> {
	Post findOneById(Long id);
	List<Post> findAllByOrderByUpdtDateDesc();
	List<Post> findAllByOrderByUpdtDateAsc();
	List<Post> findAllByTitleContainingOrderByUpdtDateDesc(String query);
	List<Post> findAllByContentContainingOrderByUpdtDateDesc(String query);
}
