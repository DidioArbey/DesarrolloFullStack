import java.util.Scanner;
public class ecuacionSegundoGrado {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        double soluciones[];
        System.out.println("Para la ecuacion de segundo grado ax^2 (+/-) bx + c");
        System.out.println("digite el valor de a:");
        a = entrada.nextInt();
        System.out.println("digite el valor de b:");
        b = entrada.nextInt();
        System.out.println("digite el valor de c:");
        c = entrada.nextInt();

        double discriminante = (Math.pow(b,2)-(4*a*c));
        if(discriminante >=0){
            soluciones = new double[1];
            soluciones[0]=((-b)-(4*a*c))/(2*a);
            System.out.println(soluciones[0]);
        }else{
            soluciones = new double[2];
            soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println(soluciones[0]);
            System.out.println(soluciones[1]);
        }
        // System.out.println(soluciones);

    }

}
