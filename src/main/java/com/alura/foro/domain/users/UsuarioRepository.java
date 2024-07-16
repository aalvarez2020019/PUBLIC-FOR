package com.alura.foro.domain.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

// Repositorio de usuario
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
    UserDetails findByNombre(String username);
}
