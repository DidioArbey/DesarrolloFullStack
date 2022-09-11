import java.util.Scanner;
public class mayor {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int n1,n2;

        System.out.println("Digite el numero 1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el numero 2: ");
        n2 = entrada.nextInt();

        if (n1>n2){
            System.out.println("El numero mayor es: "+n1);
        }else{
            System.out.println("El numero mayor es: "+n2);
        }
    }

}
