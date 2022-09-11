public class areaPerimetroCirculo {
    public static void main(String[] args) throws Exception {
        double areaCirculo,perimetroCirculo;
        int radioCirculo=4;
        double pi=3.14;
        areaCirculo = pi*(radioCirculo*radioCirculo);
        perimetroCirculo = 2*pi*radioCirculo;

        System.out.println("El perimetro del circulo es: "+perimetroCirculo);
        System.out.println("El area del circulo es: "+areaCirculo);

    }
}
