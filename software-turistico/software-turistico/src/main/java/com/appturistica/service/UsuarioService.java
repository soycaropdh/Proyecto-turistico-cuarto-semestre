package com.appturistica.service;

import com.appturistica.entities.UsuarioRol;
import com.appturistica.entities.Usuario;

import java.util.Optional;
import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Optional<Usuario> obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);

}
