import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        Lee una cadena y observando carácter a carácter sin poder retroceder. Dime cuál es
        la letra más utilizada (Sin diferenciar mayúscula y minúscula).
         */

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int count=0, max=0;
        char c= 0;
        
        
        for (int i=0; i<abecedario.length; i++) {
            for (int j=0; j<s.length(); j++) {
                if (abecedario[i]==s.toLowerCase().charAt(j)) {
                    count++;
                }
            }
            if (count>max) {
                c = abecedario[i];
                max=count;
            }
            count=0;
        }

        System.out.println(c);
        
    }
}
