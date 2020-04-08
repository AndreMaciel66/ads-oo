import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Log log = Log.getInstance();
        while (true) {
            log.escreva("Calculadora Unipac\n");
            log.escreva("Escolha qual operação quer fazer:\n");
            log.escreva("\n");
            log.escreva("1 Soma\n");
            log.escreva("2 Subtraçao\n");
            log.escreva("3 Multiplicação\n");
            log.escreva("4 Divisão\n");
            log.escreva("\n");
            log.escreva("Sua Opcao: (0 para sair):\n");

            Scanner leitor = new Scanner(System.in);
            int modo = leitor.nextInt();

            if (modo == 0) break;

            log.escreva("Informe o primeiro operador: \n");
            int operando_1 = leitor.nextInt();
            log.escreva("Informe o segundo operador: \n");
            int operando_2 = leitor.nextInt();

            Calculadora calculadora = Calculadora.getInstance();

            int resultado = calculadora.realizaOperacao(modo, operando_1, operando_2);

            log.escreva("O resultado é: " + resultado + "\n");
            
            
        }
        log.escreva("Até breve");
        // leitor.close();
    }
}