package com.alura.foro.controller;

import a.a.a.domain.topicos.*;
import com.alura.foro.domain.topics.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private RepositorioTopico repositorioTopico;

    @PostMapping
    public ResponseEntity<RetornarDatosTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico,
                                                               UriComponentsBuilder uriComponentsBuilder){
        Topico topico = repositorioTopico.save(new Topico(datosRegistroTopico));
        RetornarDatosTopico returnTopico = new RetornarDatosTopico(topico);
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(returnTopico);
    }

    @GetMapping
    public ResponseEntity<Page<ListadoTopico>> listarTopicos(Pageable paginacion){
        return ResponseEntity.ok(repositorioTopico.findAll(paginacion).map(ListadoTopico::new));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListadoTopico> buscarTopico(@PathVariable Long id) {
        Topico topico = repositorioTopico.getReferenceById(id);
        var datosTopico = new ListadoTopico(topico);
        return ResponseEntity.ok(datosTopico);
    }

    @PutMapping
    @Transactional
    public ResponseEntity<RetornarDatosTopico> actualizarTopicos(@RequestBody @Valid ActualizarDatosTopico datosActualizarTopico){
        Topico topico = repositorioTopico.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
        return ResponseEntity.ok(new RetornarDatosTopico(topico));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> eliminarTopico(@PathVariable Long id){
        Topico topico = repositorioTopico.getReferenceById(id);
        repositorioTopico.delete(topico);
        return ResponseEntity.noContent().build();
    }
}
