package com.roger.Proyecto1.repository;

import com.roger.Proyecto1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
