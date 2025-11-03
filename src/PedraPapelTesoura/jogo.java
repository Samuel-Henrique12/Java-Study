import java.util.*;

package PedraPapelTesoura;

public class jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean vitoria = false;
        boolean derrota = false;

        System.out.println("escolha sua opção");
        System.out.println("Pedra = 1");
        System.out.println("Papel = 2");
        System.out.println("Tesoura = 3");
        System.out.println("Escolha : ...");
        int escolha = scanner.nextInt();
        int escolhaAdversario = random.nextInt(3)+1;
        String nomeEscolhaJogador = "";
        String nomeEscolhaAdversario = "";
        switch (escolha){
            case 1: nomeEscolhaJogador = "Pedra";
            break;
            case 2: nomeEscolhaJogador = "Papel";
            break;
            case 3: nomeEscolhaJogador = "Tesoura";
            break;
            default:
                System.out.println("Opção invadilado");
                return;
        }
        switch (escolhaAdversario) {
            case 1:
                nomeEscolhaAdversario = "Pedra";
                break;
            case 2:
                nomeEscolhaAdversario = "Papel";
                break;
            case 3:
                nomeEscolhaAdversario = "Tesoura";
                break;
        }
        System.out.println("voce escolheu" + nomeEscolhaJogador);
        System.out.println("o samuel" + nomeEscolhaAdversario);

        if (nomeEscolhaJogador == nomeEscolhaAdversario) {
            System.out.println("emprate! ");
        }else if ((nomeEscolhaJogador == 1 && nomeEscolhaAdversario == 3) || (nomeEscolhaJogador== 2 && nomeEscolhaAdversario== 1) || (nomeEscolhaJogador== 3 && nomeEscolhaAdversario == 2)) {
                vitoria = true;
                System.out.println("vitoria");
            }
            else {
                derrota = true;
            System.out.println("perdeu");
        }
    }
}
