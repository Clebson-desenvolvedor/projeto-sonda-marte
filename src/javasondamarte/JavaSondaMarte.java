package javasondamarte;

import java.util.Locale;
import java.util.Scanner;

public class JavaSondaMarte {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int x = 0, y = 0;
        int tamEntrada = 0;
        for (int i = 0; i < entrada.length(); i++) {
            switch (entrada.charAt(i)) {
                case 'D':
                    if (x != 0) {
                        int aux = y;
                        y = -x;
                        x = -aux;
                    } else {
                        int aux = y;
                        y = x;
                        y = aux;
                        
                    }   break;
                case 'E':
                    if (x != 0) {
                        int aux = y;
                        y = x;
                        y = aux;
                        
                    } else {
                        x = -y;
                        y = 0;
                    }   break;
                case 'F':
                    x++;
                    break;
                case 'T':
                    y--;
                    break;
                default:
                    break;
            }

        }

        System.out.println("(" + x + "," + y + ")");

        sc.close();
    }
}
