package com.mpierotti.appparcialdam2020;
@Entity(tableName= "Libro")
public class Libro {
    @PrimaryKey
    @ColumnInfo(name="id_libro")
    private int id;
    @ColumnInfo(name="titulo")
    private String titulo;
    @ColumnInfo(name="autor")
    private String autor;
    @ColumnInfo(name= "esUsado")
    private boolean esUsado;

    public Libro(String titulo, String autor, boolean esUsado) {
        this.titulo = titulo;
        this.autor = autor;
        this.esUsado = esUsado;
    }

    public Libro(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEsUsado() {
        return esUsado;
    }

    public void setEsUsado(boolean esUsado) {
        this.esUsado = esUsado;
    }
}
