package com.alura.foro.domain.cursos;

import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio del curso
public interface RepositorioCurso extends JpaRepository<Curso, Long> {
}
