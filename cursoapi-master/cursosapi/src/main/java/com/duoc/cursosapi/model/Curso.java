package com.duoc.cursosapi.model;
//Arreglo: almacenar elementos y tiene tamaño fijo y es inmutable
//String[] nombreArreglo = {"cadena1","cadena2", ......};

//coleccion: guardar varios elementos y puede crecer dinamicamente
//Listas: recomedables para endpoint
//List<tipoDato> nombreLista = new ArrayList<>();


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Curso {

    @NotNull(message = "El id no puede estar vacio")
    private Integer id;

    @NotBlank(message = "El nombre no puede estar vacio")  //no puede ser null,"" o " "
    private String nombre;

    @NotBlank(message = "El deocente no puede estar vacio")
    private String docente;

    @NotNull
    private Integer horas;



    //constructor vacio
    public Curso(){

    }

    public Curso(Integer id, String nombre, String docente, Integer horas){
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
        this.horas = horas;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }








}
