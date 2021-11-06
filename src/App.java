import java.net.NetPermission;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Intoroduce 5 numeros para el arreglo \n");
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[5];

        for(int i = 0; i<5;i++){
            System.out.println((i+1)+" Introduce tus numeros \n");
            a[i] = entrada.nextInt();
        }

        for(int i = 0; i< 5;i++){
            System.out.println("Estos son los numeros dentro del arrelo: " + a[i] + "\n");
        }
        //int aux;
        for (int i = 4; i >= 0; i--) {
            /*aux = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = aux;*/
            System.out.println("Estos son los numeros del arreglo volteados: "+ a[i]);
        }
    
        
    }
}
