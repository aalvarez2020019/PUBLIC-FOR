package com.alura.foro.domain.respuestas;

import com.alura.foro.domain.users.Usuario;
import com.alura.foro.domain.topics.Topico;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuesta(@NotNull Long id, String mensaje, Topico topico , Usuario usuario, Boolean solucion) {
}
