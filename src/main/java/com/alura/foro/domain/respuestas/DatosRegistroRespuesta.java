package com.alura.foro.domain.respuestas;

import com.alura.foro.domain.users.Usuario;
import com.alura.foro.domain.topics.Topico;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroRespuesta(
        @NotBlank
        String mensaje,
        @NotNull
        Topico topico,
        @NotNull
        Usuario usuario
) {
}
