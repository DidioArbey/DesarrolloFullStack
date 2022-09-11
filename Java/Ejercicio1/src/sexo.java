import java.util.Scanner;

public class sexo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String nombre,sexo;
        int peso;
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su sexo: ");
        sexo = entrada.nextLine();
        System.out.println("Ingrese su peso en kg : ");
        peso = entrada.nextInt();

        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su sexo es: "+sexo);
        System.out.println("su peso es: "+peso+"Kg");

    }
}

