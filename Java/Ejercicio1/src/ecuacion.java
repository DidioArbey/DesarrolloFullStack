public class ecuacion {
    public static void main(String[] args) throws Exception {
        System.out.println("Para la ecuacion Y=3*x2 + 7x –1");
        int a=3;
        int b=7;
        int c=-1;
        double soluciones[];
        double discriminante = (Math.pow(b,2)-(4*a*c));
        if(discriminante >=0){
            soluciones = new double[1];
            soluciones[0]=((-b)-(4*a*c))/(2*a);

            System.out.println("y = "+soluciones[0]);
        }else{
            soluciones = new double[2];
            soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("y = "+soluciones[0]);
            System.out.println("y = "+soluciones[1]);
        }
    }
}
