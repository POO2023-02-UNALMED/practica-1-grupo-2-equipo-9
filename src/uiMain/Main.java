package uiMain;
import datper.Estudiante;
import datper.RegistroyMatricula;
import Serializacion.*;
public class Main {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante(101822, "Ramiro Rancio Ronaldo", "Calle 12+1 #6-9", 5 , 2.0, 1000000);
		RegistroyMatricula.agregarEstudiante(estudiante1);
		System.out.println(RegistroyMatricula.controlMatriculaytarifa("Informacion Estudiantes"));
	
	}
	public static void serializarAsignatura(Asignatura asignatura, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(asignatura);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Asignatura deserializarAsignatura (String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Asignatura) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
	
    }

	public static void serializarEstudiante(Estudiante estudiante, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(estudiante);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Estudiante deserializarEstudiante(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Estudiante) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
	public static void serializarGrupo(Grupo grupo, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(grupo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Grupo deserializarGrupo(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Grupo) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
	public static void serializarPersona(Persona persona, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(persona);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Persona deserializarPersona(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Persona) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
	public static void serializarProfesor(Profesor profesor, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(profesor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Profesor deserializarProfesor(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Profesor) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
	public static void serializarRegistroyMatricula(RegistroyMatricula registroymatricula String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(registroymatricula);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static RegistroyMatricula deserializarRegistroyMatricula(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (registroymatricula) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
