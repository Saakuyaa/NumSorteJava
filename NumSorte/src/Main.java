import java.util.Random;
import java.util.Scanner;


public class Main

{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random randomizacao = new Random();
        int tentativas = 0;
        int cpu = randomizacao.nextInt(100);
        System.out.printf("Ola digite seu nome:\n");
        String nome = leitor.nextLine();
        int premio = randomizacao.nextInt(100);

        for (int i = 0; i < 5; i++) {

            System.out.printf("Ola %s \n Digite seu numero da sorte:\n",nome);
            int numsorte = leitor.nextInt();


               // a linha de baixo foi inserida pra facilitar na hora de testar o código
            System.out.printf("premio %d",premio);

            if (numsorte == premio ){



                System.out.println("""
                                
                    
██╗░░░██╗░█████╗░██╗░░░██╗██╗░░░░░░░██╗██╗███╗░░██╗
╚██╗░██╔╝██╔══██╗██║░░░██║██║░░██╗░░██║██║████╗░██║
░╚████╔╝░██║░░██║██║░░░██║╚██╗████╗██╔╝██║██╔██╗██║
░░╚██╔╝░░██║░░██║██║░░░██║░████╔═████║░██║██║╚████║
░░░██║░░░╚█████╔╝╚██████╔╝░╚██╔╝░╚██╔╝░██║██║░╚███║
░░░╚═╝░░░░╚════╝░░╚═════╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝
"""
                );
                System.out.printf("O numero de tentativas foi : %d \n",tentativas);
                System.out.printf("O numero sorteado foi: %d \n",premio);
                break;
            }


            else {
                System.out.println("""
                        
                        ██╗░░░██╗░█████╗░██╗░░░██╗██╗░░░░░░█████╗░░██████╗███████╗
                        ╚██╗░██╔╝██╔══██╗██║░░░██║██║░░░░░██╔══██╗██╔════╝██╔════╝
                        ░╚████╔╝░██║░░██║██║░░░██║██║░░░░░██║░░██║╚█████╗░█████╗░░
                        ░░╚██╔╝░░██║░░██║██║░░░██║██║░░░░░██║░░██║░╚═══██╗██╔══╝░░
                        ░░░██║░░░╚█████╔╝╚██████╔╝███████╗╚█████╔╝██████╔╝███████╗
                        ░░░╚═╝░░░░╚════╝░░╚═════╝░╚══════╝░╚════╝░╚═════╝░╚══════╝  """
                );
                tentativas = tentativas + 1;

            }if(numsorte > premio){
                System.out.println("Voce digitou um valor muito alto, tente novamente");
            }if(numsorte < premio){
                System.out.println("Voce digitou um valor muito baixo, tente novamente");

            }
        }

    }

}