import java.util.Objects;

public class ListaPessoasFunctions {


    static ListaPessoas adicionarPessoa(ListaPessoas pessoas, Pessoa pessoa) {
        Node node = new Node(pessoa, null);
        if (pessoas.head == null) {
            pessoas.head = node;
            pessoas.tail = node;
        } else {
            pessoas.tail.next = (node);
            pessoas.tail = node;
        }

        return pessoas;
    }

    static ListaPessoas removerPessoa(ListaPessoas pessoas, Pessoa pessoa) {
        Node actual = pessoas.head;
        Node prev = null;

        while (actual != null) {
            if (actual.value.equals(pessoa)) {
                if (prev == null) {
                    pessoas.head = actual.next;
                    if (pessoas.head == null) {
                        pessoas.tail = null;
                    }
                } else {
                    prev.next = actual.next;
                    if (actual.next == null) {
                        pessoas.tail = prev;
                    }
                }
                return pessoas;
            }
            prev = actual;
            actual = actual.next;
        }
        return pessoas;
    }

    static String obterDadosPessoas(ListaPessoas pessoas) {
        String result = "";
        Node currentNode = pessoas.head;
        while (currentNode != null) {
            Pessoa pessoa = currentNode.value;
            result += pessoa.BI + " " + pessoa.Nome + " (" + pessoa.Nacionalidade + ")\n";
            currentNode = currentNode.next;
        }
        return result;
    }


    static int contarPessoas(ListaPessoas pessoas) {
        int count = 0;
        Node actual = pessoas.head;
        while (actual != null) {
            count++;
            actual = actual.next;
        }
        return count;
    }


    static int contarPessoasNacionalidade(ListaPessoas pessoas, String nacionalidade) {
        int count = 0;
        Node actual = pessoas.head;
        while (actual != null) {
            if (Objects.equals(actual.value.Nacionalidade, nacionalidade)) {
                count++;
            }
            actual = actual.next;
        }
        return count;
    }


    static boolean procurarPessoa(ListaPessoas pessoas, int bi) {
        for (Node actual = pessoas.head; actual != null; actual = actual.next) {
            if (actual.value.BI == bi) {
                return true;
            }
        }
        return false;
    }

    static ListaPessoas adicionarPessoa(ListaPessoas pessoas, Pessoa p, int pos) {
        Node node = new Node(p, null);
        if (pos == 0) {
            node.next = pessoas.head;
            pessoas.head = node;
        } else {
            Node prev = pessoas.head;
            for (int i = 0; i < pos - 1; i++) {
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        if (pessoas.tail == null) {
            pessoas.tail = node;
        }
        return pessoas;
    }

    public static ListaPessoas inverterLista(ListaPessoas pessoas) {
        Node prev = null;
        Node actual = pessoas.head;
        Node next = null;

        while (actual != null) {
            next = actual.next;
            actual.next = prev;
            prev = actual;
            actual = next;
        }

        pessoas.head = prev;
        return pessoas;
    }
}
