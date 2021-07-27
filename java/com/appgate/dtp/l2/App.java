package com.appgate.dtp.l2;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException, FileNotFoundException
    {
        File archivo = new File ("/workspaces/L2-Test-main/data/dominios.txt");
        String cadena;
        FileReader archive = new FileReader(archivo);
        BufferedReader archiveBR = new BufferedReader(archive);
        FileWriter fichero = new FileWriter("/workspaces/L2-Test-main/data/ok.csv");
        PrintWriter archivePW = new PrintWriter(fichero);
        Map<String, Integer> tlds = new HashMap();

        while ((cadena = archiveBR.readLine()) != null) {
            String [] palabra = cadena.replace(".", " ").split(" ");
            tlds.put(palabra[1], tlds.containsKey(palabra[1]) ? tlds.get(palabra[1]) + 1 : 1);
        }      
        
        String[] arreglo_tlds = new String[tlds.size()];
        int[] arreglo_repeticiones = new int[tlds.size()];
        tlds.keySet().toArray(arreglo_tlds);
        archivePW.println("\"TLD\",\"Cantidad\"");
        for (int i = 0; i < arreglo_tlds.length; i++) {
            arreglo_repeticiones[i] = tlds.get(arreglo_tlds[i]);
        }

        for (int i = 0; i < arreglo_repeticiones.length; i++) {
            archivePW.println(arreglo_tlds[i] + "," + arreglo_repeticiones[i]);
        }

        System.out.println();     
        archiveBR.close();
        archivePW.close();
    }
}
