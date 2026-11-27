package desafios.Bar_OO.application;

import desafios.Bar_OO.entities.Bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bill bill = new Bill();
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", bill.feeding());
        if (bill.cover() != 0) {
            System.out.printf("Couvert = R$ %.2f\n", bill.cover());
        } else {
            System.out.println("Isento de Couvert");
        }
        System.out.printf("Ingresso = R$ %.2f\n", bill.ticket());
        System.out.printf("\nValor a pagar = R$ %.2f", bill.total());
    }
}
