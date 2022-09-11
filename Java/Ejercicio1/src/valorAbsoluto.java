import java.util.Scanner;
public class valorAbsoluto {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        if(numero>=0){
            System.out.println(numero);
        }else{
            System.out.println(Math.abs(numero));
        }

    }
}
