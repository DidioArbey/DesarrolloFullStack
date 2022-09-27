// import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) throws Exception {

        // Scanner teclado = new Scanner(System.in);

        int matriz [][] = new int [3][3];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matriz [i][j] = (int) (Math.random()*10);
            }
        }

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
