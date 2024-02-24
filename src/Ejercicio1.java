import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    /*
    Lee una cadena y observando carácter a carácter sin poder retroceder, muestra por
    pantalla cuantas veces está la sílaba ‘pa’.
     */
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Escribe una cadena:");
        String s = sc.nextLine();
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i)=='p' && s.charAt(i+1)=='a') {
                count++;
            }
        }

        System.out.println("La sílaba 'pa' aparece " + count + " veces.");
    }
}
