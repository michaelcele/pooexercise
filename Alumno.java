import java.util.Scanner;

public class Alumno extends Persona {
        
        int nota = NotaAlumno();

        public Alumno(String nombre, int edad, char sexo){

                super(nombre, edad, sexo);
                
        }

        int NotaAlumno(){
                Scanner ingreso = new Scanner(System.in);
                nota = ingreso.nextInt();
                return nota;

        }

}
