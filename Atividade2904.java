package aula2;

import java.util.Scanner;

public class tay2904 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaIdades = 0;
        int contadorIdades = 0;
        
        System.out.println("Digite as idades (digite 0 para finalizar):");
        
        while (true) {
            int idade = scanner.nextInt();
            
            if (idade == 0) {
                break; 
            }
            
            somaIdades += idade;
            contadorIdades++;
        }
        
        if (contadorIdades == 0) {
            System.out.println("Nenhuma idade foi digitada.");
        } else {
            double media = (double) somaIdades / contadorIdades;
            System.out.println("A média das idades digitadas é: " + media);
        }
        
        scanner.close();
    }
}



