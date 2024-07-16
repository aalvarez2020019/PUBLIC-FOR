package com.alura.foro.domain.topics;

import java.util.Date;

public record ListadoTopico(String titulo, String mensaje, Date fechaCreacion, String estado, String usuario, String curso) {
    public ListadoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getEstadoTopico().toString(), topico.getUsuario().getNombre(), topico.getCurso().getNombre());
    }
}
