/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "C:\\Users\\laboratorio\\Documents\\JAR\\lista.txt";
        List<String> list = readByJava(filename);
        System.out.println("Digite: ");
        String term = scanner.nextLine();
        
        String result = "";
        
        result = searchInList(list, term);
        System.out.println("Result: " + result);
    }
    
    private static String searchInList(List<String> list, String term) {
        String searchReturn = "";
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(term)) {
                searchReturn = list.get(i);   
            }
        }
        return searchReturn;
    }
    
    private static List<String> readByJava(String fileName) {
        ArrayList<String> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.ready()) {
                result.add(br.readLine());
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
