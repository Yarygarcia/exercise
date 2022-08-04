import javax.swing.JOptionPane;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class hola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo1[] = new int[10], arreglo2[] = new int[10], arreglo3 [] = new int[20];
        for(int i =0; i< arreglo1.length; i++){
            System.out.print("ingresa un numero: ");
            arreglo1[i] = entrada.nextInt();
            System.out.print("ingresa un numero: ");
            arreglo2[i] = entrada.nextInt();
        }
        int menor;
        for(int y =0; y <arreglo1.length; y++){

            for(int x = 0; x < 9; x++){
                if(arreglo1[x] > arreglo1[x+1]){
                    menor = arreglo1[x+1];
                    arreglo1[x+1] = arreglo1[x];
                    arreglo1[x] = menor;
                }
            }
            for(int x = 0; x < 9; x++){
                if(arreglo2[x] > arreglo2[x+1]){
                    menor = arreglo2[x+1];
                    arreglo2[x+1] = arreglo2[x];
                    arreglo2[x] = menor;
                }
            }
        }
        int array=0;
        for(int z=0; z < arreglo3.length; z+=2){
            arreglo3[z]= arreglo1[array];
            arreglo3[z+1] = arreglo2[array];
            array++;
        }
        for(int f =0; f<arreglo3.length; f++){
            for(int g =0; g <19; g++){
                if(arreglo3[g] > arreglo3[g+1]){
                    menor = arreglo3[g+1];
                    arreglo3[g+1] = arreglo3[g];
                    arreglo3[g] = menor;
                }
            }
        }

        System.out.println("Arreglo 1: ");
        for(int e: arreglo1){
            System.out.print(e+ " ");
        }
        System.out.println(" ");
        System.out.println("Arreglo 2: ");
        for(int a: arreglo2){
            System.out.print(a + " ");
        }
        System.out.println(" ");
        System.out.println("Arreglo : ");
        for (int o: arreglo3){
            System.out.print(o + " ");
        }
    }
}