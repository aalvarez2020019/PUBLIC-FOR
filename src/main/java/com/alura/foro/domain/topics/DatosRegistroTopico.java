package com.alura.foro.domain.topics;

import com.alura.foro.domain.users.DatosUsuario;
import com.alura.foro.domain.cursos.DatosCurso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// Datos del registro topico
public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        EstadoTopico estadoTopico,
        @NotNull
        @Valid
        DatosUsuario usuario,
        @NotNull
        @Valid
        DatosCurso curso
) {
}
