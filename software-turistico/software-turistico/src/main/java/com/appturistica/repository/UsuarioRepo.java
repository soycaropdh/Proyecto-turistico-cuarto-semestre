package com.appturistica.repository;

import com.appturistica.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepo extends JpaRepository <Usuario, Long> {


    Optional<Usuario> findByUsername(String username);

}
