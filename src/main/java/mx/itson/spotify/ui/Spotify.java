/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.spotify.entities.*;


/**
 *
 * @author alumnog
 */
public class Spotify {
    
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Ezkai");
        artista.setPerfil("Artista versatil y blablabla");
        artista.setOyentesMensuales(100000);
        artista.setFollowers(550000);
        
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Lo minimo");
        cancion1.setDuracion(180);
        
        Cancion cancion2 = new Cancion();
        cancion2.setTitulo("Villain");
        cancion2.setDuracion(200);
        
        List<Cancion> temas = new ArrayList<>();
        temas.add(cancion1);
        temas.add(cancion2);
        
        Album album = new Album();
        album.setNombre("Rain");
        album.setArtista(artista);
        album.setFechaLanzamiento(new Date());
        album.setCancion(temas);
        album.setGenero("Pop");
        
        System.out.println(artista.getNombre());
        System.out.println(album.getNombre());
        System.out.println(album.getArtista());
        
        for(Cancion c : album.getCancion()){
            
        }
    }
    
}
