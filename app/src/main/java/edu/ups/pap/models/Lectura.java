package edu.ups.pap.models;

import java.util.function.Function;

public class Lectura <T> {
    private String idSensor;
    private T valor;
    private String unidad;
    
    public Lectura(String idSensor, T valor, String unidad) {
        this.idSensor = idSensor;
        this.valor = valor;
        this.unidad = unidad;
    }

    // Getters
    public String getIdSensor() {
        return idSensor;
    }
    public T getValor() {
        return valor;
    }
    public String getUnidad() {
        return unidad;
    }

    public <R> Lectura<R> transformar(Function<T,R> conversor, String nuevaUnidad) throws IllegalAccessException {
        if(conversor == null){
            throw new IllegalAccessException("El conversor no puede ser nulo"); 
        }
        R nuevo = conversor.apply(valor);
        
        return new Lectura<>(idSensor, nuevo, nuevaUnidad);

    }
    
    
}
