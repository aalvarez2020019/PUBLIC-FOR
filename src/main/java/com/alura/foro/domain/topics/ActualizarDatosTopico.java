package com.alura.foro.domain.topics;

import com.alura.foro.domain.users.Usuario;
import com.alura.foro.domain.cursos.Curso;
import jakarta.validation.constraints.NotNull;

// Actualizar Datos Topico
public record ActualizarDatosTopico(@NotNull Long id, String titulo, String mensaje, EstadoTopico estadoTopico, Usuario usuario, Curso curso) {

}
