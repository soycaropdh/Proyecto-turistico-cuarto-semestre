package com.appturistica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name= "Usuarios")
@Getter
@Setter

public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


  private String username;


  private String password;

  private String nombre;


  private String apellido;


  private String email;


  private String telefono;

  private boolean enable = true;

  private String perfil;

  @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "usuario")
  @JsonIgnore
  private Set<UsuarioRol> usuarioRoles = new HashSet<>();


  public Usuario() {
  }
}
