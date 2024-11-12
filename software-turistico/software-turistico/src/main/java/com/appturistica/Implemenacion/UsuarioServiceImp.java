package com.appturistica.Implemenacion;

import com.appturistica.entities.UsuarioRol;
import com.appturistica.entities.Usuario;
import com.appturistica.repository.RolRepo;
import com.appturistica.repository.UsuarioRepo;
import com.appturistica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepo;

    @Autowired

    private RolRepo rolRepo;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        // Verificar si el usuario ya existe en la base de datos
        Optional<Usuario> usuarioExistente = usuarioRepo.findByUsername(usuario.getUsername());

        if (usuarioExistente.isPresent()) {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya está presente");
        } else {
            // Guardar cada rol en la base de datos si aún no existe
            for (UsuarioRol usuarioRol : usuarioRoles) {
                rolRepo.save(usuarioRol.getRol());
                usuarioRol.setUsuario(usuario); // Vincular el usuario con cada UsuarioRol
            }
            // Asignar los roles al usuario y guardar el usuario en la base de datos
            usuario.getUsuarioRoles().addAll(usuarioRoles);

            // Guardar el usuario con sus roles
            return usuarioRepo.save(usuario);
        }
    }

    @Override
    public Optional<Usuario> obtenerUsuario(String username) {
        return usuarioRepo.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
   usuarioRepo.deleteById(usuarioId);
    }
}