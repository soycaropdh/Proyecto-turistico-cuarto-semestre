package com.appturistica;

import com.appturistica.entities.Rol;
import com.appturistica.entities.UsuarioRol;
import com.appturistica.entities.Usuario;
import com.appturistica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SoftwareTuristicoApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SoftwareTuristicoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/* Usuario usuarios = new Usuario();

		usuarios.setUsername("Caro palma");
		usuarios.setPassword("Danis2502");
		usuarios.setNombre("Carolina");
		usuarios.setApellido("Palma");
		usuarios.setEmail("cpalma@gamil.com");
		usuarios.setTelefono("3235449823");
		usuarios.setPerfil("foto.png");

		Rol rol = new Rol();
		rol.setRolid(2L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuarios);
		usuarioRoles.add(usuarioRol);


		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuarios, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());

   */
	}
}
