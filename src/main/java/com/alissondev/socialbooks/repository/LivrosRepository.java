package com.alissondev.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissondev.socialbooks.entities.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
