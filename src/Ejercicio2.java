import java.util.Scanner;



public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        Dada dos fechas dime cuantos días de diferencia hay entre ellas (Sin usar Date).
        Ejemplo: entre el 1 de enero de 1998 y el 4 de enero de 1998 hay 3 días.
         */

        Scanner sc = new Scanner(System.in);
        String fecha1 = sc.next();
        sc.nextLine();
        String fecha2 = sc.next();
        sc.nextLine();

        String[] f1 = fecha1.split("/");
        String[] f2 = fecha2.split("/");
        int anio1 = Integer.parseInt(f1[2]);
        int anio2 = Integer.parseInt(f2[2]);
        int aux;

        int mes1 = Integer.parseInt(f1[1]);
        int mes2 = Integer.parseInt(f2[1]);
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dia1 = Integer.parseInt(f1[0]);
        int dia2 = Integer.parseInt(f2[0]);

        if (anio1>anio2) {
            aux=anio1;
            anio1=anio2;
            anio2=aux;

            aux=mes1;
            mes1=mes2;
            mes2=aux;

            aux=dia1;
            dia1=dia2;
            dia2=aux;
        }

        // Contador de años
        int count=0;
        for (int i=anio1+1; i<anio2; i++) {
            count+=365;
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count++;
            }
        }

        // Contador de dias por meses
        for (int i=mes1; i< meses.length; i++) {
            count+=meses[i];
        }
        count+=(meses[mes1-1]-dia1);

        for (int i=0; i<mes2-1; i++) {
            count+=meses[i];
        }

        // Comprobacion de si el ultimo año es bisiesto
        if ((anio2 % 4 == 0 && anio2 % 100 != 0) || (anio2 % 400 == 0)) {
            count++;
        }
        count+=dia2;


        System.out.println(count);

    }
}
