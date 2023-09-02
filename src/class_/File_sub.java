package class_;

import java.io.*;

public class File_sub {
    public static void crearArchivo(String NombreDeArchivo) {
        File archivo = new File(NombreDeArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void agregarArchivo(String NombreDelArchivo, String[] campos, int pin) {
        File archivo = new File(NombreDelArchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));
      
            
            switch(NombreDelArchivo){
                //segun le archivo a copiar en aux_1 con el pin verifica que arhivo y copia segun el archivo
                case "Empleados.txt" -> pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5] + ";" + campos[6] + ";" + campos[6]);
                case "Ventas.txt" -> pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4]+ ";" + campos[5]);
                case "aux_1.txt" -> { 
                    if(pin == 0){
                        pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4] + ";" + campos[5] + ";" + campos[6] + ";" + campos[6]);
                    }else{
                        pw.println(campos[0] + ";" + campos[1] + ";" + campos[2] + ";" + campos[3] + ";" + campos[4]+ ";" + campos[5]);
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

    public static void eliminarArchivo(String NombreDelArchivo) {
        File archivo = new File(NombreDelArchivo);
        archivo.delete();
    }

    public static void renombrarArchivo(String NombreDelArchivo, String NuevoNombreDelArchivo) {
        File archivo = new File(NombreDelArchivo);
        archivo.renameTo(new File(NuevoNombreDelArchivo));
    }

    public static void eliminarRegistro(String pal, String NombreDelArchivo) {
        crearArchivo("aux_1.txt");
        
        //verifica en que archivos se modificará
        int pin = 0;
        if("Ventas.txt".equals(NombreDelArchivo)){
            pin = 1;
        }
        boolean encontrado = false;
        try {
            BufferedReader br_prueba = new BufferedReader(new FileReader(NombreDelArchivo));
            String linea_sep = br_prueba.readLine();
            String[] campos_prueba;
            campos_prueba = new String[100];
            while (linea_sep != null) {
                campos_prueba = linea_sep.split(";");
           
                if (pal.equals(campos_prueba[2])) {
                    encontrado = true;
                } else {
                    agregarArchivo("aux_1.txt", campos_prueba, pin);
                }
                linea_sep = br_prueba.readLine();
            }
             br_prueba.close();
            if (encontrado == true) {
                eliminarArchivo(NombreDelArchivo);
                //
                switch(NombreDelArchivo){
                    case "Empleados.txt"->{
                        renombrarArchivo("aux_1.txt", "Empleados.txt");break;
                    }
                    case "Ventas.txt"->{
                        renombrarArchivo("aux_1.txt", "Ventas.txt");break;
                    }
                }
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
        int pin = 0;
        if("Ventas.txt".equals(NombreDelArchivo)){
            pin = 1;
        }
        boolean fin = false;
        try {
            BufferedReader br_prueba = new BufferedReader(new FileReader(NombreDelArchivo));
            String linea_sep = br_prueba.readLine();
            while (linea_sep != null) {
                String[] campos_prueba = linea_sep.split(";");
                if (campos_prueba[2].equals(campos[2])) {
                    fin = true;
                    System.out.println("Registro ya existente");
                }

                linea_sep = br_prueba.readLine();
            }

            if (fin == false) {
                agregarArchivo(NombreDelArchivo,campos,pin);
            }
            br_prueba.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
