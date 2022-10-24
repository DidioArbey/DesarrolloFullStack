import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double mat[][] = new double [30][6];
        double mediaAsignatura=0.0;
        double mediaAlumno =0.0;

        for(int i=0;i<30;i++){
            for(int j=0;j<6;j++){
                System.out.println("Digite la nota para el estudiante "+ (i+1) + " de la asignatura :"+(j+1));
                mat [i][j] = (double) (Math.random()*5);
            }
        }

        for(int i=0;i<30;i++){
            for(int j=0; j<=6; j++){
                mediaAlumno = mediaAlumno + mat[i][j];

                mediaAsignatura = mediaAsignatura + mat[j][i];
                mediaAsignatura = mediaAsignatura/30;
                System.out.println("la media de la asigntura "+ (j+1)+" es: "+mediaAsignatura);
            }
            mediaAlumno = mediaAlumno/6;
            System.out.println("la media de la Alumno "+(i+1)+" es: "+mediaAlumno);


        }

    }
}
