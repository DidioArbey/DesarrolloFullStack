import java.util.Scanner;
public class digitos {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        if ( numero >9){
            System.out.println("el numero tiene 2 digitos");
        }else{
            System.out.println("el numero tiene un digito2");
        }

    }
}
