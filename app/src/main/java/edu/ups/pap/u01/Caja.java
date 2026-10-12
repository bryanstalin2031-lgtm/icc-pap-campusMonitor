package edu.ups.pap.u01;

import java.util.function.Function;

// CLASES GENERICAS
public class Caja<T> {
    //DATO GENERICO
    private final T valor;

    public Caja(T valor) {
        this.valor = valor;
    }

    //METODO GENRICO 
    //GETTER
    public T obtener(){
        return valor;
    }
    
    //METODO GENRICO
    public <R> R mapear(Function<T, R> operacion){
        R resultado = operacion.apply(valor);
        return resultado;
    }

    
}
