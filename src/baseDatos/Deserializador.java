package baseDatos;

import java.io.File;
import java.util.ArrayList;

import gestorAplicacion.Asignatura;
import gestorAplicacion.Estudiante;
import gestorAplicacion.Grupo;
import gestorAplicacion.Persona;
import gestorAplicacion.Profesor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializador {
	private static <T> void deserializar(ArrayList<T> lista, String nombre){
		
        File archivo = new File("");
        FileInputStream fis;
        ObjectInputStream ois;

        try {

            File path = new File(archivo.getAbsolutePath()+"/src/baseDatos/temp/"+nombre+".txt");
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            lista.addAll((ArrayList<T>) ois.readObject());
            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

    }
	public static void deserializarListas(){
        deserializar(Estudiante.estudiantesregistrados, "Estudiantes");
        deserializar(Grupo.getGrupostotales(), "Grupos");
        deserializar(Asignatura.materiastotales, "Materias");
        deserializar(Persona.getPersonasensistema(), "Personas");
        deserializar(Profesor.getProfesoresconlau(), "Profesores");
 }
}

// Nota importante: esta parte del codigo no es hecha completamente por mi Ricardo Lopera
// La persona responsable de cualquier eventualidad o nota por dicho acto soy yo 
// en vista de que hice el proyecto solo y no tenia claro como hacer
// esta parte tomé como referencia chatGPT y otros proyectos.
