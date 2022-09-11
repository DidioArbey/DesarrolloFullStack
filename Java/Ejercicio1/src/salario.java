import java.util.Scanner;
public class salario {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        double salarioNuevo;
        int salario;
        System.out.println("Digite su sueldo: ");
        salario = entrada.nextInt();
        salarioNuevo = salario +(salario*0.25);
        System.out.println("El salario con el bono es: $"+salarioNuevo);

    }

}

