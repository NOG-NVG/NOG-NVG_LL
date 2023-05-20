public class Pessoa {
    String Nome;
    int BI;
    String Nacionalidade;

    Pessoa() {
    }

    public Pessoa(String nome, int BI, String nacionalidade) {
        Nome = nome;
        this.BI = BI;
        Nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "" + Nome + BI + Nacionalidade;
    }
}
