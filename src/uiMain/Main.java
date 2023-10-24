package uiMain;
import gestorAplicacion.Asignatura;
import gestorAplicacion.Estudiante;
import gestorAplicacion.Grupo;
import gestorAplicacion.Persona;
import gestorAplicacion.Profesor;
import gestorAplicacion.RegistroyMatricula;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import baseDatos.Serializador;
import baseDatos.Deserializador;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		while (true) {
            System.out.println("Sistema de Información Académica");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Informacion Estudiantes");
            System.out.println("4. Estudiantes con matricula cero");
            System.out.println("5. Crear nueva asignatura por defecto"); 
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
            case 1:
                System.out.print("Ingrese el Nombre del estudiante: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingresa la Direccion del estudiante: ");
                String direccion = scanner.nextLine();
                System.out.print("Ingresa la cedula del estudiante: ");
                int cc = scanner.nextInt();
                scanner.nextLine();

                Estudiante estudiante = new Estudiante(cc, nombre, direccion);
                RegistroyMatricula.agregarEstudiante(estudiante);
                System.out.println("El estudiante: "+ estudiante.toString()+" fue agregado con exito.");
                break;
            case 2:
                System.out.print("Ingrese la cedula del estudiante a buscar: ");
                String cedula = scanner.nextLine();
                int numCC = Integer.parseInt(cedula);
                boolean encontrarestudiante = Estudiante.encontrarEstudianteconCC(numCC);
                if (encontrarestudiante == true) {
                    System.out.println("Estudiante encontrado");
                } else {
                    System.out.println("Estudiante no encontrado.");
                }
                break;
            case 3:
            	System.out.println(RegistroyMatricula.controlMatriculaytarifa("Informacion Estudiantes"));
            	break;
            case 4:
            	System.out.println(RegistroyMatricula.controlMatriculaytarifa("Estudiantes con matricula cero"));
            case 5:
            	System.out.println(RegistroyMatricula.controlMatriculaytarifa("Crear nueva asignatura por defecto"));
            case 6:
                System.out.println("Saliendo del sistema.");
                System.exit(0);
            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
        }
		}
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
	public static void serializarRegistroyMatricula(RegistroyMatricula registroymatricula, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(registroymatricula);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static RegistroyMatricula deserializarRegistroyMatricula(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (RegistroyMatricula) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
