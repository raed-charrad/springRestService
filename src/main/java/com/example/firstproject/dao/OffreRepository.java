package com.example.firstproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstproject.entity.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}
