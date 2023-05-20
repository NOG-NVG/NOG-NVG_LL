public class Main {
    static Pessoa pessoa1 = new Pessoa("JoaquimBerto", 0, "Pais de Portugal");
    static Pessoa pessoa2 = new Pessoa("Joberto", 2, " NaoSeiQuePais");
    static Pessoa pessoa3 = new Pessoa("Tuwiwi", 100000000, "wtv");
    static Pessoa[] pessoas = {pessoa1, pessoa2, pessoa3};

    static ListaPessoas meusColegas() {
        Node node1 = new Node(pessoa1);
        Node node2 = new Node(pessoa2);
        Node node3 = new Node(pessoa3);
        node1.next = node2;
        node2.next = node3;
        ListaPessoas listaPessoas = new ListaPessoas(node1, node3);
        return listaPessoas;
    }

    public static void main(String[] args) {

    }
}
