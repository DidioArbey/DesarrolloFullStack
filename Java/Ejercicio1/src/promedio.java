import java.util.Scanner;
public class promedio {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int n1,n2,n3,n4,n5,sumatoria;
        double promedio;
        System.out.println("Digite el numero 1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el numero 2: ");
        n2 = entrada.nextInt();
        System.out.println("Digite el numero 3: ");
        n3 = entrada.nextInt();
        System.out.println("Digite el numero 4: ");
        n4 = entrada.nextInt();
        System.out.println("Digite el numero 5: ");
        n5 = entrada.nextInt();
        sumatoria = n1+n2+n3+n4+n5;
        promedio=sumatoria/5;

        System.out.println("La suma de todos los numero ingresados es: "+sumatoria);
        System.out.println("Lel promedio de los 5 numero es: "+promedio);
    }

}

// Calcular el promedio de 5 números, y mostrar la suma y el promedio
