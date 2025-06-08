package com.safewater.safewater_api.repository;

import com.safewater.safewater_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findFirstByEmail(String email);
}
