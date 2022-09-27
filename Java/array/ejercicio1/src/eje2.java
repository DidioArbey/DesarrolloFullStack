import java.util.Scanner;

public class eje2 {
    
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int [] arreglo = new int [5];
        boolean band=true;

        while(band==true){
            for(int i=0;i<5;i++){
                System.out.println(("Digite el valor ")+(i+1)+" del arreglo");
                arreglo[i] = teclado.nextInt();
                if(arreglo[i]==i){
                    System.out.println("El numero ya se encuentra en el arreglo");
                }else{
                    band=false;
                }
            }
        }

        for(int i=0;i<3;i++){
            System.out.println(arreglo[i]);
        }

    }
}
