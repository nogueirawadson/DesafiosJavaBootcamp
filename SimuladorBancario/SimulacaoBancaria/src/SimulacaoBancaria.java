import java.util.Locale;
import java.util.Scanner;


public class SimulacaoBancaria {
    public static void main(String[] args)  {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      float saldo = 0;  
      float deposito = 0;
      float saque = 0;
      int opcao = scanner.nextInt();
     
        // Loop infinito para manter o programa em execução até que o usuário decida sair
       
        
         while (true) {
        
           
          switch (opcao) {
           
          case 1: {
            deposito = scanner.nextFloat(); 
            saldo = deposito + saldo;
            System.out.println("Saldo Atual: " + saldo);
            break; }
           
          case 2: {
            saque =  scanner.nextFloat();
             if (saque > saldo) {
             System.out.println("Saldo Insuficiente");
            break; 
               } 
               else {
              saldo = (saque) - (saldo);
               System.out.println("Saldo Atual: " + saldo);
              } 
                break; }
          case 3: {
              System.out.println(saldo);
              break; }
      
          case 0: {
          System.out.println("Encerrar");
            break;
           // System.out.println("encerrar");
            
          }
          default:
              System.out.println("Opção inválida. Tente novamente.");
          }
        }
      }
    }
  

     