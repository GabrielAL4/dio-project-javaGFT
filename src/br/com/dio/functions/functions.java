package br.com.dio.functions;
import java.util.Scanner;
public class functions {

    public static int menu(String[] args){
        Scanner tipo = new Scanner(System.in);
        System.out.println("Qual o tipo de animal?");
        System.out.println("1 - Gato");
        System.out.println("2 - Cachorro");
        System.out.println("3 - Cavalo");
        System.out.println("4 - Passaro");
        System.out.println("5 - Roedor");
        System.out.println("6 - Roedor");
        int an = tipo.nextInt();
        return an;
    }
}
