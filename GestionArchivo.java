import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class GestionArchivo {

    public static void crearArchivo(String nombreArchivo) {
        try {
            File archivoNuevo = new File(nombreArchivo);
            if (archivoNuevo.createNewFile()) {
                System.out.println("¡Archivo creado exitosamente!");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public static void insertarEnArchivo(String nombreArchivo, Object obj) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            escritor.write(obj.toString());
            escritor.newLine();
            System.out.println("Datos insertados en el archivo exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static boolean buscarRepetido(String nombreArchivo, int id, String nombre) {
        File archivo = new File(nombreArchivo);
        
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (linea.contains("ID=" + id) && linea.contains("Nombre=" + nombre)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return false;
    }
    



    public static void eliminarObj(String nombreArchivo, int id) {
        File archivo = new File(nombreArchivo);
        List<String> lineas = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (!linea.contains("ID=" + id)) {
                    lineas.add(linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : lineas) {
                escritor.write(linea);
                escritor.newLine();
            }
            System.out.println("Jugador eliminado del archivo exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void modificarObj(String nombreArchivo, int id, String nuevoNombre, int nuevosGoles) {
        File archivo = new File(nombreArchivo);
        List<String> lineas = new ArrayList<>();
    
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (linea.contains("ID=" + id)) {
                    // Obtener los datos actuales
                    String[] partes = linea.split(",");
                    // Modificar el nombre y el número de goles
                    int numeroGoles = Integer.parseInt(partes[3].split("=")[1]);
                    String nuevaLinea = "ID=" + id + ", Nombre=" + nuevoNombre + ", Equipo=" + partes[2] + ", NumeroGoles=" + numeroGoles + ", NumeroAutoGoles=" + partes[4] + ", NumeroPases=" + partes[5];
                    lineas.add(nuevaLinea);
                } else {
                    lineas.add(linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : lineas) {
                escritor.write(linea);
                escritor.newLine();
            }
            System.out.println("Datos modificados en el archivo exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    
        public static void buscarJugadorEspecifico(String nombreArchivo, int id) {
        File archivo = new File(nombreArchivo);

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (linea.contains("ID=" + id)) {
                    JOptionPane.showMessageDialog(null, "Jugador encontrado: " + linea);
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Jugador no encontrado.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}


