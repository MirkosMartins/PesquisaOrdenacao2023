import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class TextSorter {

    public static void main(String[] args) {
        try {
            // Ler o texto de um arquivo
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\leosc\\OneDrive\\Documentos\\trabalhos facul\\Metodos de ordenacao\\BubbleSort-Shakersort-Leonardo\\src\\Texto.txt"));
            List<String> linhas = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                linhas.add(line);
            }
            br.close();

            // Juntar todas as linhas em uma única string
            StringBuilder allText = new StringBuilder();
            for (String l : linhas) {
                allText.append(l).append(" ");
            }
            String text = allText.toString().trim();

            // Dividir o texto em palavras
            String[] palavras = text.split(" ");

            // Ordenar as palavras com Bubble Sort
            String[] bubbleSorted = bubbleSort(palavras.clone());

            // Ordenar as palavras com Shaker Sort
            String[] shakerSorted = shakerSort(palavras.clone());

            // Salvar as palavras ordenadas em arquivos .txt
            saveToFile("bubble_sorted.txt", bubbleSorted);
            saveToFile("shaker_sorted.txt", shakerSorted);

            System.out.println("Palavras ordenadas com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] bubbleSort(String[] arr) {
        int n = arr.length;
        boolean auxiliar;
        do {
            auxiliar = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    auxiliar = true;
                }
            }
            n--;
        } while (auxiliar);
        return arr;
    }

    public static String[] shakerSort(String[] arr) {
        int esquerda = 0;
        int direita = arr.length - 1;
        boolean auxiliar;
        do {
            auxiliar = false;

            // Mova o maior elemento para a direita
            for (int i = esquerda; i < direita; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    auxiliar = true;
                }
            }
            direita--;

            // Mova o menor elemento para a esquerda
            for (int i = direita; i > esquerda; i--) {
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    auxiliar = true;
                }
            }
            esquerda++;
        } while (auxiliar);
        return arr;
    }

    public static void saveToFile(String fileName, String[] arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (String palavra : arr) {
            bw.write(palavra);
            bw.newLine();
        }
        bw.close();
    }
}