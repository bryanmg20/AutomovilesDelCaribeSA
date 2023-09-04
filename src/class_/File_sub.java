package class_;

import java.io.*;
import javax.swing.JLabel;

public class File_sub {
    //Crea el archivo sin ningun registro
    public static void crearArchivo(String NombreDeArchivo) {
        File archivo = new File(NombreDeArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    //agrega un archivo en un archivo
    public static void agregarArchivo(String NombreDelArchivo, String[] campos, int pin) {
        File archivo = new File(NombreDelArchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));
            //Dependiendo del archivo a copiar en aux_1 tienen campos diferentes 
            switch (NombreDelArchivo) {
                //segun le archivo a copiar en aux_1 con el pin verifica que arhivo y copia segun el archivo
                case "Empleados.txt" ->
                    pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5] + ";" + campos[6] + ";" + campos[6]);
                case "Ventas.txt" ->
                    pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5]);
                case "aux_1.txt" -> {
                    //El pin es para determinar que tipo de archivo auxiliar es (empleados, ventas o actualizar)
                    switch (pin) {
                        case 0 ->
                            pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5] + ";" + campos[6] + ";" + campos[6]);
                        case 10 ->
                            pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5] + ";" + campos[6] + ";" + campos[7]);
                        default ->
                            pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5]);
                    }
                }
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    //Elimina un archivo segun el nombre que le des como parametro
    public static void eliminarArchivo(String NombreDelArchivo) {
        File archivo = new File(NombreDelArchivo);
        archivo.delete();
    }
    //Cambia el nombre de un archivo a otro
    public static void renombrarArchivo(String NombreDelArchivo, String NuevoNombreDelArchivo) {
        File archivo = new File(NombreDelArchivo);
        archivo.renameTo(new File(NuevoNombreDelArchivo));
    }
    //elimina el registro  segun el archivo
    public static void eliminarRegistro(String pal, String NombreDelArchivo, JLabel elim) {
        //Se llama la funcion crearArchivo para crearlo en blanco
        crearArchivo("aux_1.txt");
        //verifica en que archivos se modificará
        int pin = 0;
        if ("Ventas.txt".equals(NombreDelArchivo)) {
            pin = 1;
        }
        //Se declara un booleano para controlar si encuentra o no el archivo
        boolean encontrado = false;
        try {
            BufferedReader br_archivo = new BufferedReader(new FileReader(NombreDelArchivo));
            String linea_archivo = br_archivo.readLine();
            String[] campos_prueba;
            campos_prueba = new String[100];
            while (linea_archivo != null) {
                campos_prueba = linea_archivo.split(";");
                //Si la palabra coincide con una en un archivo se cambia el booleano y no copia el registro
                if (pal.equals(campos_prueba[2])) {
                    encontrado = true;
                } else {
                    //Escribe lo que no coincide con la palabra en el archivo
                    agregarArchivo("aux_1.txt", campos_prueba, pin);
                }
                linea_archivo = br_archivo.readLine();
            }
            br_archivo.close();
            //Si encuentra la palabra se elimina el archivo actual y se renombra el auxiliar
            if (encontrado == true) {
                eliminarArchivo(NombreDelArchivo);
                elim.setVisible(false);
                //
                switch (NombreDelArchivo) {
                    case "Empleados.txt" -> {
                        renombrarArchivo("aux_1.txt", "Empleados.txt");
                        break;
                    }
                    case "Ventas.txt" -> {
                        renombrarArchivo("aux_1.txt", "Ventas.txt");
                        break;
                    }
                }
            } else {
                //Sino se elimina el auxialiar
                eliminarArchivo("aux_1.txt");
                elim.setVisible(true);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    //Verifica si el registro ya existe 
    public static void agregarRegistro(String[] campos, String NombreDelArchivo, JLabel hola) {
        //verifica en que archivos se modificará
        int pin = 0;
        if("Ventas.txt".equals(NombreDelArchivo)){
            pin = 1;
        }
        //Se declara un booleano para controlar si encuentra o no el archivo
        boolean fin = false;
        try {
            BufferedReader br_archivo = new BufferedReader(new FileReader(NombreDelArchivo));
            String linea_archivo = br_archivo.readLine();
            while (linea_archivo != null) {
                String[] campos_prueba = linea_archivo.split(";");
                //Si es igual el campo se cambia el boolean a verdadero
                if (campos_prueba[2].equals(campos[2])) {
                    fin = true;
                    hola.setVisible(true);
                }
                
                linea_archivo = br_archivo.readLine();
            }
            //Si no encuentra el registro llama a la funcion agregarArchivo y lo escribe al final 
            if (fin == false) {
                agregarArchivo(NombreDelArchivo, campos, pin);
                hola.setVisible(false);
            }
            br_archivo.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }

    public static String[][] ObtenerArchivo(String NombreDeArchivo) {
        int row = 0;
        String[][] aux = new String[100][100];

        File archivo = new File(NombreDeArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {

                aux[row] = lectura.split(";");
                row++;

                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        String[][] file_employee = new String[row][aux[0].length];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < aux[0].length; j++) {
                file_employee[i][j] = aux[i][j];

            }
        }

        return file_employee;
    }
}
