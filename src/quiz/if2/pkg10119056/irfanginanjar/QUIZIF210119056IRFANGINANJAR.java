/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119056.irfanginanjar;
import java.util.Scanner;
/**
 *
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan 
 */
public class QUIZIF210119056IRFANGINANJAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Customer customer=new Customer();
        System.out.println("====Program kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        customer.setName(input.nextLine());
        System.out.print("Customer Email : ");
        customer.setEmail(input.nextLine());
        customer.displayService();
        ServicePrice price=new ServicePrice();
        price.getPrice(input.nextInt());
    }
    
}
