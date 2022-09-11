import java.util.Scanner;
public class prom {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3,promedio;
        System.out.println("Digite la nota 1: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite la nota 2: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite la nota 3: ");
        n3 = entrada.nextFloat();
        promedio = (n1+n2+n3)/3;
        if(promedio>=7){
            System.out.println("Promocionado");
        }else if( promedio >=4 && promedio < 7){
            System.out.println("Regular");
        }else{
            System.out.println("Reprobado");
        }


    }
    
}
