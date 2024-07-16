package com.alura.foro.domain.respuestas;

import com.alura.foro.domain.topics.ListadoTopico;

import java.util.Date;

public record DatosListadoRespuesta(String mensaje, ListadoTopico topico, Date fechaCreacion, String usuario, Boolean solucion) {
    public DatosListadoRespuesta(Respuesta respuesta){
        this(respuesta.getMensaje(), new ListadoTopico(respuesta.topico), respuesta.getFechaCreacion(), respuesta.getUsuario().getNombre(), respuesta.getSolucion());
    }
}
