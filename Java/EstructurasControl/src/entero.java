import java.util.Scanner;
public class entero {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        if(numero == 0){
            System.out.println("El numero es neutro");
        } else if (numero > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
