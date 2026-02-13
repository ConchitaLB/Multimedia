package com.Ercilla;

public abstract class Contenido {
    private String titulo;
    private int duracion;   //en minutos

    //Constructor
    public Contenido (String titulo, int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    //getters and setters
    public String getTitulo(){
        return titulo;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }


    //Metodo de la clase
    public void reproducir(){
        System.out.println("Reproduciendo: " + titulo);
    }

    //Metodo abstracto
    public abstract  String getTipo();


}
