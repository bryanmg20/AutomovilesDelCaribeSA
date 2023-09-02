package class_;

import java.io.*;

public class File_sub {

    public static void agregarArchivo(String NombreDelArchivo, String[] campos) {
        File archivo = new File(NombreDelArchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));
            if (NombreDelArchivo.equals("Empleados.txt")) {
                pw.println(campos[0] + " " + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5] + ";" + campos[6] + ";" + campos[6]);
            } else {
                pw.println(campos[0] + " " + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5]);
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void eliminarArchivo(String NombreDelArchivo) {
        File archivo = new File(NombreDelArchivo);
        archivo.delete();
    }

    public static void renombrarArchivo(String NombreDelArchivo, String NuevoNombreDelArchivo) {
        File archivo = new File(NombreDelArchivo);
        archivo.renameTo(new File(NuevoNombreDelArchivo));
    }

    public static void eliminarRegistro(String pal, String NombreDelArchivo) {
        boolean encontro = false;
        try {
            BufferedReader br_prueba = new BufferedReader(new FileReader(NombreDelArchivo));
            String linea_sep = br_prueba.readLine();
            while (linea_sep != null) {
                String[] campos_prueba = linea_sep.split(";");
                if (campos_prueba[1].equals(pal)) {
                    encontro = true;
                } else {
                    agregarArchivo("aux_1.txt", campos_prueba);
                }
                linea_sep = br_prueba.readLine();
            }
            br_prueba.close();
            if (encontro == true) {
                eliminarArchivo(NombreDelArchivo);
                renombrarArchivo("aux_1.txt", "Empleados.txt");
            } else {
                eliminarArchivo("aux_1.txt");
                System.out.println("No se encontro el registro");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void agregarRegistro(String[] campos, String NombreDelArchivo) {
        boolean fin = false;
        try {
            BufferedReader br_prueba = new BufferedReader(new FileReader(NombreDelArchivo));
            String linea_sep = br_prueba.readLine();
            while (linea_sep != null) {
                String[] campos_prueba = linea_sep.split(";");
                if (campos_prueba[1].equals(campos[2])) {
                    fin = true;
                    System.out.println("Registro ya existente");
                }

                linea_sep = br_prueba.readLine();
            }

            if (fin == false) {
                agregarArchivo(NombreDelArchivo, campos);
            }
            br_prueba.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
