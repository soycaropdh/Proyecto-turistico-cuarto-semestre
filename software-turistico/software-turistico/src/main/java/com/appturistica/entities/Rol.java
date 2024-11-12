package com.appturistica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name="Roles")
@Getter
@Setter


public class Rol {

    @Id

    private Long rolid;

    private String nombre;

    @OneToMany(cascade =CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    @JsonIgnore
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();

}
