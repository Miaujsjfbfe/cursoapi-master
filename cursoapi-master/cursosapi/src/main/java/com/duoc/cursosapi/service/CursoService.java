package com.duoc.cursosapi.service;
import com.duoc.cursosapi.model.Curso;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service

public class CursoService {

    private List<Curso> listaCursos = new ArrayList<>();

    private String[] modalidades = {"Presencial", "Online", "Hibrido"};

    public CursoService(){
        //cargar datos
        listaCursos.add(new Curso(1, "FullStack I", "Marcelo Crisostomo", 100));
        listaCursos.add(new Curso(2, "Base de Datos", "German Barrientos", 120));
        listaCursos.add(new Curso(3, "IA", "Gio", 150));
    }


    public List<Curso> obtenerCursos(){
        return listaCursos;
    }

    public String[] obtenerModalidades(){
        return modalidades;
    }

    public Curso guardarCurso(Curso curso){
        listaCursos.add(curso);
        return curso;
    }




}
