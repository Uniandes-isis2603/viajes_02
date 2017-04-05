/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.viajes.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author jm.dominguez
 */

@Entity
public class ConductorEntity extends UsuarioEntity{
    /**
     * Identificado del Conductor
     */
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Nombre del conductor.
     */
    private String nombre;
    /**
     * Genero del conductor
     */
    private String genero;
    /**
     * Telefono del conductor
     */
    private Integer telMovil;
    /**
     * Edad del conductor
     */
    private Integer edad;
    /**
     * Rating del conductor
     */
    private Double rating;
    /**
     * Correo del conductor.
     */
    private String correo;
    /**
     * Imagen del conductor
     */
    private String imagen;
    /**
     * Automoviles del conductor.
     */
    @OneToMany (cascade = CascadeType.ALL)
    private List<AutomovilEntity> automoviles;
    /**
     * Viajes del conductor.
     */
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "conductor")
    private List <ViajeEntity> viajes;
    /**
     * Retorna los viajes del conductor
     * @return List: ista de viajes del conductor
     */
    public List<ViajeEntity> getViajes() {
        return viajes;
    }
    /**
     * Asigna una lista de viajes al conductor
     * @param viajes: Lista de viajes del conductor.
     */
    public void setViajes(List<ViajeEntity> viajes) {
        this.viajes = viajes;
    }
    
    
    /**
     * Rtorna la lista de automoviles del conductor.
     * @return automoviles: Lista de automoviles
     */
    public List<AutomovilEntity> getAutomoviles() {
        return automoviles;
    }
    /**
     * Asigna la lista de automoviles del conductor.
     * @param automoviles: Lista de automoviles.
     */
    public void setAutomoviles(List<AutomovilEntity> automoviles) {
        this.automoviles = automoviles;
    }
    /**
     * Retorna el id del conductor.
     * @return Retorna el id del conductor
     */
    public Long getId() {
        return id;
    }
    /**
     * Asigna un id al conductor.
     * @param id: identificador del conductor.
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * retorna el nombre del conductor.
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Asigna un nombre al conductor
     * @param nombre: Nombre del conductor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Asigna Retorna el genero del conductor.
     * @return genero del conductor.
     */
    @Override
    public String getGenero() {
        return genero;
    }
    /**
     * Asigna un genero a el conductor
     * @param genero del conductor
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Retorna el telefono del conductor
     * @return Telefono del conductor.
     */
    public Integer getTelMovil() {
        return telMovil;
    }
    /**
     * Asigna un telefono al conductor
     * @param telMovil: Telefono del conductor
     */
    public void setTelMovil(Integer telMovil) {
        this.telMovil = telMovil;
    }
    /**
     * Retorna la edad del conductor.
     * @return 
     */
    public Integer getEdad() {
        return edad;
    }
    /**
     * Asigna una edad al conductor
     * @param edad: Edad del conductor.
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    /**
     * Retorna el rating del conductor
     * @return rating del conductor
     */
    public Double getRating() {
        return rating;
    }
    /**
     * Asigna un rating al conductor
     * @param rating del conductor
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }
    /**
     * Retorna el correo del conductor
     * @return Correo del conductor
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Asigna un correo al conductor
     * @param correo del conductor
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Re-escripción del metodo equals
     * @param obj : Objeto a comparar
     * @return true si los objetos son iguales, false de lo contrario.
     */
    @Override
    public boolean equals(Object obj){
        ConductorEntity conductor = (ConductorEntity) obj;
        
        return this.getId().equals(conductor.getId());
    }
    /**
     * HashCode re-escrito
     * @return int: hashCode del objeto
     */
    @Override
    public int hashCode(){
        if(this.getId() != null){
            return this.getId().hashCode();
        }
        
        return super.hashCode();
    }
    
    public String getImagen(){
        return this.imagen;
    }
    
    public void setImagen(String imagen){
        this.imagen = imagen;
    }
    
    
}
