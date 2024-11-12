package com.appturistica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter

public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usuarioRolId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")  // Especificar clave foránea de Usuario
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "rol_id", referencedColumnName = "rolid")  // Especificar clave foránea de Rol
    private Rol rol;

}
