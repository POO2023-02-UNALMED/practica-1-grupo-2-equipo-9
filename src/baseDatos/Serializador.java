package baseDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import gestorAplicacion.Asignatura;
import gestorAplicacion.Estudiante;
import gestorAplicacion.Grupo;
import gestorAplicacion.Persona;
import gestorAplicacion.Profesor;

public class Serializador {
	private static void serializar (ArrayList<? extends Object> lista, String nombre) {
	    
        File archivo = new File("");

        try{
            File path = new File(archivo.getAbsolutePath()+"/src/baseDatos/temp/"+nombre+".txt"); 
            
            FileOutputStream f = new FileOutputStream(path);
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            o.writeObject(lista);

            o.close();
            f.close();
        }
        catch(FileNotFoundException e){
            System.out.println("No se encuentra el archivo");
        }
        catch(IOException e){
            System.out.println("Error Flujo de inicializacion");
        }
	}
	 public static void serializarListas(){
	        Serializador.serializar(Estudiante.estudiantesregistrados, "Estudiantes");
	        Serializador.serializar(Grupo.getGrupostotales(), "Grupos");
	        Serializador.serializar(Asignatura.materiastotales, "Materias");
	        Serializador.serializar(Persona.getPersonasensistema(), "Personas");
	        Serializador.serializar(Profesor.getProfesoresconlau(), "Profesores");
	 }
	
}
