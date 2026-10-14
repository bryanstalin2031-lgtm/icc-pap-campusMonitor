
package edu.ups.pap;
import edu.ups.pap.models.Lectura;
import edu.ups.pap.models.Reporte;
public class App {
    public static void main(String[] args) throws IllegalAccessException {
        runLectura(); // Pc1.1a
        runTransformaciones();
    }

    

    private static void runLectura() {
        Lectura<Double> temperatura = new Lectura<>(
                "S01", 22.5, "°C");
        Lectura<Integer> lectura1 = new Lectura<>("S02", 18, "Personas");

        System.out.println("Lecturas de CampusMonitor");
        System.out.println(temperatura.getIdSensor() + " | " + temperatura.getValor() + " " + temperatura.getUnidad());
        System.out.println(lectura1.getIdSensor() + " | " + lectura1.getValor() + " " + lectura1.getUnidad());

        System.out.println("Valores recuperados sin casting:");
        System.out.println("Temperatura: " + temperatura.getValor());
        System.out.println("Ocupación: " + lectura1.getValor());
        System.out.println();
    }
    private static void runTransformaciones() throws IllegalAccessException {
        Lectura<Double> temperatura = new Lectura<>(
                "S01", 22.5, "°C");
        Lectura<Double> f = temperatura.transformar(valor -> valor * 9 / 5 + 32, "°F");

        Lectura<Integer> lectura2 = new Lectura<>("S02", 18, "Personas");
        Lectura<String> v = lectura2.transformar(t -> t + " personas", "texto");

        
        System.out.println("Lecturas de CampusMonitor");
        System.out.println("Original: " + temperatura.getIdSensor() + " | " + temperatura.getValor() + " " + temperatura.getUnidad());
        System.out.println("Transformada: " + temperatura.getIdSensor() + " | " + f.getValor() + " " + f.getUnidad());
        System.out.println();
        System.out.println("Original: " + lectura2.getIdSensor() + " | " + lectura2.getValor() + " " + lectura2.getUnidad());
        System.out.println("Transformada: " + lectura2.getIdSensor() + " | " + v.getValor() + "| " + "unidad: " + v.getUnidad());
        System.out.println();

        Lectura<Double> temperatura2 = new Lectura<>("S01", 22.5, "°C");
        //Lectura<Reporte> x = temperatura2.transformar(valor -> new Reporte(temperatura2.getIdSensor(), valor, temperatura2.getUnidad()), "Reporte");


    
    }



   
    
}
