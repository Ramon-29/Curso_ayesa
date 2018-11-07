/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template fileIn, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo1.ejercicios06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author TIC
 */
public class EjemploClase {

    public static void main(String[] args) throws Exception {

        /*File fileIn = new File("ficheros/iris.arff");
        FileInputStream fis = null;

        File fileOut = new File("ficheros/copia_iris.arff");
        FileOutputStream fout = null;

        try {

            fout = new FileOutputStream(fileOut);
            if (!fileOut.exists()) {
                fileIn.createNewFile();
            }

            fis = new FileInputStream(fileIn);

            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                //System.out.print((char) content);
                fout.write((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                    fout.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
         */
        File curDir = new File("C:\\Users\\TIC\\.m2\\repository");
        getAllFiles(curDir);
       
    }

    public static void getAllFiles(File curDir) {
        File[] filesList = curDir.listFiles();
        for (File f : filesList) {
            if (f.isDirectory() && f.getName().compareTo("bin")==0) {
                getAllFiles(f);
                System.out.println(f);
            }
           /* if (f.isFile()) {
                System.out.println(f.getName());
            }*/
        }
    }

    
            
}
