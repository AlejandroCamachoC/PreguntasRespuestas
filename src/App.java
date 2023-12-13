import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        Set<Integer> numerosGenerados = new HashSet<>();
        String[] preguntas = new String[15];
        String[] respuestas = new String[15];
        preguntas[0]   =   "¿España ganó el mundial en el 2010?";           respuestas[0]   =   "Si";
        preguntas[1]   =   "¿Gibraltar pertenece a la Union Europea?";      respuestas[1]   =   "No";
        preguntas[2]   =   "¿Marruecos se merecia ganar el mundial?";       respuestas[2]   =   "No";
        preguntas[3]   =   "¿Me gustan los caballos?";                      respuestas[3]   =   "Si";
        preguntas[4]   =   "¿Tengo el carnet de conducir?";                 respuestas[4]   =   "No";
        preguntas[5]   =   "De que color es doraemon?";                     respuestas[5]   =   "Azul";
        preguntas[6]   =   "¿Cuantos mundailes tiene españa?";              respuestas[6]   =   "1";
        preguntas[7]   =   "¿Mejor equipo de Sevilla?";                     respuestas[7]   =   "Sevilla";
        preguntas[8]   =   "¿Deporte mas seguido de españa?";               respuestas[8]   =   "Futbol";
        preguntas[9]   =   "¿Cuanto es 2 + 2?";                             respuestas[9]   =   "4";
        preguntas[10]  =   "¿Soy guapo?";                                   respuestas[10]  =   "Si";
        preguntas[11]  =   "¿Me gusta el cine?";                            respuestas[11]  =   "Si";
        preguntas[12]  =   "¿Tios antes que tias?";                         respuestas[12]  =   "Si";
        preguntas[13]  =   "¿Betis o Sevilla?";                             respuestas[13]  =   "Si";
        preguntas[14]  =   "¿Me gusta el futbol?";                          respuestas[14]  =   "Si";
        
        for (int i = 0; i < preguntas.length; i++) {
            int nrm;
            do {
                nrm = rm.nextInt(preguntas.length);
            } while (!numerosGenerados.add(nrm));

            System.out.println(preguntas[nrm]);
            String res = sc.nextLine();
            if (res.equalsIgnoreCase(respuestas[nrm])){
                System.out.println("Esa es la respuesta correcta");
            } else {
                System.out.println("La respuesta correcta es " + respuestas[nrm]);
            }
        }

    }
}
