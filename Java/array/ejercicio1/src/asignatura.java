import java.util.Scanner;

public class asignatura {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],asignatura,alumnos;
        alumnos=30;
        asignatura=5;

        matriz= new int[alumnos][asignatura];

        for (int i=0;i<=alumnos;i++){//numero de filas
            for(int j=0;j<=asignatura;j++){//numro de columnas
                System.out.println("nota del alumno "+ i+1 +" asgnatura "+ j+1 +" : ");
                matriz [i][j]=entrada.nextInt();
            }
        }

        //salida de la matriz
        System.out.println("Las notas son:");
        for (int i=0;i<=alumnos;i++){//numero de filas
            for(int j=0;j<=asignatura;j++){//numro de columnas
                System.out.println(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
