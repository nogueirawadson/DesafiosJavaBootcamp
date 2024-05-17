import java.util.Scanner;

public class ControleSimplesDeSaque {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double limiteDiario = ler.nextDouble();
   
   // double saques = 0;

    for( double saques = 0; limiteDiario > saques; saques=+saques  ) {
        //System.out.println(""); 
        double saque = ler.nextDouble();
    
        saques =+ saque;
        if (saques == 0) {
            System.out.println("Transacoes encerradas.");
            break;
        } else if (limiteDiario <= saque) {
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        } else if (saque < limiteDiario) {
            double novoSaldo = limiteDiario - saques; 
           limiteDiario = novoSaldo;
            System.out.println("Saque realizado. Limite restante: " + novoSaldo + " \nTransacoes encerradas. ");
            break;
            
           
        } 
       
        }
        ler.close(); 
    }

    }

