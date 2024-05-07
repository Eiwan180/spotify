/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.entities;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class Album {
    
    //Hola, esto es un problema de GitHub
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the artista
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * @return the fechaLanzamiento
     */
    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * @param fechaLanzamiento the fechaLanzamiento to set
     */
    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * @return the cancion
     */
    public List<Cancion> getCancion() {
        return cancion;
    }

    /**
     * @param cancion the cancion to set
     */
    public void setCancion(List<Cancion> cancion) {
        this.cancion = cancion;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    private String nombre;
    private Artista artista;
    private Date fechaLanzamiento;
    private List<Cancion> cancion;
    private String genero;
    
    public Album deserializar(String json){
        Album album = new Album();
        try{
            album = new Gson().fromJson(json, Album.class);
        } catch(Exception ex){
            System.err.println("Ocurrio un error al deserializar" + ex.getMessage());
        }
        return album;
    }
}
