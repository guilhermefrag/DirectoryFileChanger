/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mudadordepasta;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author guilhermefrag
 */
public class MudadorDePasta {

     public static void main(String[] args) throws IOException {
        
        String folderPath = "/home/guilhermefrag/Documentos/";
        
        File file = new File(folderPath + "teste.txt");
        
        if (file.createNewFile()) {
            System.out.println("Arquivo criadp");
        } else {
            System.out.println("arquivo já existe");
        }
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pressione 2 para trocar a pasta");
        String input = reader.readLine();
        
        if (input.equals("2")) {
            System.out.println("Digite o caminho da nova pasta: ");
            folderPath = reader.readLine();
            
            File newFolder = new File(folderPath);
            File newFile = new File(newFolder.getPath() + "/teste.txt");
            if (file.renameTo(newFile)) {
                System.out.println("Arquivo movido");
            } else {
                System.out.println("Falha ao mover arquivo");
            }
        }
    }
}
