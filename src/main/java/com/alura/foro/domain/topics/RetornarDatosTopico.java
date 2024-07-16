package com.alura.foro.domain.topics;

import java.util.Date;

// Retornar datos
public record RetornarDatosTopico(Long id, String titulo, String mensaje, Date fechaCreacion, String EstadoTopico, String usuario, String curso) {
    public RetornarDatosTopico(Topico topico) {
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getEstadoTopico().toString(), topico.getUsuario().getNombre(), topico.getCurso().getNombre());
    }
}
