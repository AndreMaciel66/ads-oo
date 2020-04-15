public class Tabuleiro {

    public String[] linha1 = { "1", "2", "3"};
    public String[] linha2 = { "4", "5", "6"};
    public String[] linha3 = { "7", "8", "9"};

    private Log log = Log.getInstancia();

    /*  1 2 3
        4 5 6
        7 8 9
    */

    public void imprime() {
        log.escrever("|" + linha1[0] + "|" + linha1[1] + "|" + linha1[2] + "|");
        log.escrever("|" + linha2[0] + "|" + linha2[1] + "|" + linha2[2] + "|");
        log.escrever("|" + linha3[0] + "|" + linha3[1] + "|" + linha3[2] + "|");
    }

    public void mudaPeca(String posicao, String peca){
        switch (posicao) {
            case "1":
                linha1[0] = peca;
                break;
            case "2":
                linha1[1] = peca;
                break;
            case "3":
                linha1[2] = peca;
                break;
            case "4":
                linha2[0] = peca;
                break;
            case "5":
                linha2[1] = peca;
                break;
            case "6":
                linha2[2] = peca;
                break;
            case "7":
                linha3[0] = peca;
                break;
            case "8":
                linha3[1] = peca;
                break;
            case "9":
                linha3[2] = peca;
                break;
        
            default:
                log.escrever("Non existe! :(");
                break;
        }
    }

}