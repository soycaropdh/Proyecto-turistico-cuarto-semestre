package com.appturistica.controllers;


import com.appturistica.entities.Rol;
import com.appturistica.entities.Usuario;
import com.appturistica.entities.UsuarioRol;
import com.appturistica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping ("/")
    public Usuario guardarUsuario (@RequestBody Usuario usuario) throws Exception{
        Set<UsuarioRol> roles = new HashSet<>();
        Rol rol = new Rol();
        rol.setRolid(3L);
        rol.setNombre("NORMAL");

        UsuarioRol  usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        return usuarioService.guardarUsuario(usuario,roles);

    }

    @GetMapping ("/{username}")
    public Optional<Usuario> obtenerUsuarios (@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping ("/{usuarioId}")
    public void eliminarUsuario (@PathVariable("usuarioId") Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);

    }
}
