import java.util.Scanner;
public class Punto1 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        double raiz,potencia;

        System.out.println("Digite el numero 1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el numero 2: ");
        n2 = entrada.nextInt();
        System.out.println("Digite el numero 3: ");
        n3 = entrada.nextInt();
        System.out.println("Digite el numero 4: ");
        n4 = entrada.nextInt();
        System.out.println("Digite el numero 5: ");
        n5 = entrada.nextInt();

        if (n1>n2 && n1>n3 && n1>n4 && n1>n5){
            System.out.println("El numero mayor es: "+n1);
        }else if(n2>n1 && n2>n3 && n2>n4 && n2>n5){
            System.out.println("El numero mayor es: "+n2);
        }else if(n3>n1 && n3>n2 && n3>n4 && n3>n5){
            System.out.println("El numero mayor es: "+n3);
        }else if(n4>n1 && n4>n2 && n4>n3 && n4>n5){
            System.out.println("Elnumero mayor es: "+n4);
        }else{
            System.out.println("Elnumero mayor es: "+n5);
        }

        if (n1<n2 && n1<n3 && n1<n4 && n1<n5){
            System.out.println("El numero menor es: "+n1);
        }else if(n2<n1 && n2<n3 && n2<n4 && n2<n5){
            System.out.println("El numero menor es: "+n2);
        }else if(n3<n1 && n3<n2 && n3<n4 && n3<n5){
            System.out.println("El numero menor es: "+n3);
        }else if(n4<n1 && n4<n2 && n4<n3 && n4<n5){
            System.out.println("El numero menor es: "+n4);
        }else{
            System.out.println("El numero menor es: "+n5);
        }

        raiz= Math.pow(n3, 1/5);
        potencia = Math.pow(n1, n5);

        System.out.println("La raiz 5 de "+n3+" es: "+raiz);
        System.out.println("La potencia de "+n1+"en "+n5+" es: "+potencia);


    }
}
