import java.util.Scanner;
public class mayorOperador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int n1,n2;

        System.out.println("Digite el numero 1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el numero 2: ");
        n2 = entrada.nextInt();

        if (n1>n2){
            int suma,diferencia;
            suma = n1+n2;
            diferencia = n1 -n2;
            System.out.println("la suma de los dos numeros es: "+suma);
            System.out.println("la diferencia de los dos numeros es: "+diferencia);
        }else{
            int producto;
            double division;
            producto = n1*n2;
            division =n1 / n2;
            System.out.println("El producto de los dos numeros es: "+producto);
            System.out.println("La division de los dos numeros es: "+division);
        }
    }
}
