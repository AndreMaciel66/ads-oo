import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Log log = Log.getInstancia();

    log.escrever("Iniciando jogo...");
    log.escrever("Informe o nome do jogador 1:");
    
    Scanner leitor = new Scanner(System.in);
    String nomeDoJogador1 = leitor.next();

    Jogador jogador1 = new Jogador();
    jogador1.nome = nomeDoJogador1;
    jogador1.peca = "X";

    log.escrever("Informe o nome do jogador 2:");
    String nomeDoJogador2 = leitor.next();

    Jogador jogador2 = new Jogador();
    jogador2.nome = nomeDoJogador2;
    jogador2.peca = "0";

    log.escrever("Jogador da vez: " + jogador1.nome + " (Símbolo: " + jogador1.peca + ")");

    log.escrever("Jogador da vez: " + jogador2.nome + " (Símbolo: " + jogador2.peca + ")");

    Tabuleiro tabuleiro = new Tabuleiro();
    tabuleiro.imprime();
    log.escrever("Jogada posição 3, peça X");
    tabuleiro.mudaPeca("5", "O");
    tabuleiro.imprime();

    leitor.close();
  }
}