
public class areas {
    public static void main(String[] args) throws Exception {
        double areaCirculo,areaCuadrado,areaTriangulo;
        int ladoCuadrado=4;
        int alturaTriangulo=3;
        int baseAltura=5;
        int radioCirculo=4;
        double pi=3.14;

        areaCuadrado = ladoCuadrado*ladoCuadrado;
        areaTriangulo = (alturaTriangulo*baseAltura)/2;
        areaCirculo = pi*(radioCirculo*radioCirculo);

        System.out.println("El area del cuadrado es: "+areaCuadrado);
        System.out.println("El area del triangulo es: "+areaTriangulo);
        System.out.println("El area del circulo es: "+areaCirculo);
        }
}


// import java.util.Scanner;
//     public static void main(String[] args) throws Exception {
//         Scanner entrada = new Scanner(System.in);
       
//     }
// }
