package com.duoc.cursosapi.controller;

import com.duoc.cursosapi.model.Curso;
import com.duoc.cursosapi.service.CursoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    //instancia del servicio
    private final CursoService cursoService;

    //
    public CursoController(CursoService cursoService){
        this.cursoService = cursoService;
    }

    //obtener todos los cursos
    @GetMapping
    public List<Curso> listarCursos(){
        return cursoService.obtenerCursos();
    }

    //obtener las modalidades
    @GetMapping("/modalidades")
    public String[] listarModalidades(){
        return cursoService.obtenerModalidades();
    }

    //Guardar
    //debo poner @valid para que haga la validacion de service
    @PostMapping
    public Curso agregarCursos(@Valid @RequestBody Curso curso){
        return cursoService.guardarCurso(curso);

    }

}
