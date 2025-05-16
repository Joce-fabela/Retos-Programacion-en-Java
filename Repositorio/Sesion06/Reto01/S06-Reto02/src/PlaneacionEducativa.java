import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

// Paso 1: Definimos la clase
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo); // Orden natural: alfabetico
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class PlaneacionEducativa {
    public static void main(String[] args) {

        // Paso 2: Creamos una lista concurrente
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("\uD83D\uDCDA Lectura comprensiva", 2));
        temas.add(new Tema("\uD83D\uDCCA Matemáticas básicas", 1));
        temas.add(new Tema("\uD83C\uDF33 Cuidado del medio ambiente", 3));

        // Paso 3: Ordenamos los temas alfabeticamente usando comparable
        Collections.sort(temas);
        System.out.println("✅Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Paso 4: Ordenamos los temas por prioridad usando Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("\n \uD83D\uDCC8 Temas ordenados por prioridad (1 = urgente):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Paso 5: Creamos un mapa concurrente de recursos usando ConcurrentHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("\uD83D\uDCDA Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("\uD83D\uDCCA Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("\uD83C\uDF33 Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        // Paso 6: Mostramos el repositorio de recursos por tema
        System.out.println("\n \uD83D\uDCDA¦ Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " \uD83D\uDCDA " + recursos.get(tema));
        }
    }
}