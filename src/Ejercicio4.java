import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        Entre un número y su doble (ambos incluidos) siempre existe un número primo. Crea
        un programa que lo compruebe, dado un número devuelve true si existe al menos un primo,
        false en caso contrario.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean esPrimo=false;
        int count=0;
        for (int i=num; i<=num*2 && !esPrimo; i++) {
            for (int j=1; j<=i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count==2) {
                esPrimo=true;
            }
            count=0;
        }
        System.out.println(esPrimo);
    }
}
