import java.util.Scanner;
public class sueldo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int sueldo;
        System.out.println("Digite su sueldo: ");
        sueldo = entrada.nextInt();
        if (sueldo > 3000){
            System.out.println("Debes abonar impuesto ");
        }

    }
}
