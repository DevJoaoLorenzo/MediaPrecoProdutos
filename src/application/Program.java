package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        double soma;
        System.out.println("Quantos produtos deseja cadastrar? ");
        n = sc.nextInt();
        Product[] vet = new Product[n];
        for (int i=0;i<vet.length;i++){
            sc.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            vet[i] = new Product(nome, preco);
        }
        soma=0.0;
        for (Product product : vet) {
            soma += product.getPreco();
        }
        System.out.printf("Média do preço dos produtos: R$ %.2f", soma/n);



        sc.close();
    }
}
