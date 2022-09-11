import java.util.Scanner;
public class mayorMejorado {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        if (numero < 10){
            System.out.println("El numero tiene un digito");
        }else if(numero ==10 || numero <= 99 ){
            System.out.println("El numero es de dos digitos");
        }else if( numero >100 || numero < 999){
            System.out.println("El mumero es de 3 digitos");
        }else{
            System.out.println("Lo siento error en tu digitacion");
        }
    }
}
