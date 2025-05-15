import java.util.*;
public class RegistroMuestras {
    public static void main(String[] args) {
        //Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList <String> muestras = new ArrayList<>();

        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("\uD83D\uDCE5 ‹ Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);
        System.out.println("\n Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        muestrasInvestigador.put("M-001", "Dra. López");
        muestrasInvestigador.put("M-002", "Dr. Hernández");
        muestrasInvestigador.put("M-003", "Dra. Rivera");

        System.out.println("\n \uD83E\uDDD1\u200D\uD83D\uDD2C Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " \uD83E\uDDEC" + entry.getValue());
        }

        // Paso 4: Mostrar resultados
        String idBuscar = "M-002"; // Puedes cambiar este valor si lo deseas
        System.out.println("\uD83E\uDDD1\u200D\uD83D\uDD2C Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}


