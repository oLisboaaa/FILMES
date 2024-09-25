package Filme;

class Filme {
    // Atributos da classe Filme
    private String nome; // Nome do filme
    private String genero; // Gênero do filme
    private int duracao; // Duração do filme em minutos

    // Construtor da classe Filme que inicializa os atributos
    public Filme(String nome, String genero, int duracao) {
        this.nome = nome; // Inicializa o nome
        this.genero = genero; // Inicializa o gênero
        this.duracao = duracao; // Inicializa a duração
    }

    // Método para definir o nome do filme
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome; // Atualiza o nome se não estiver vazio
        }
    }

    // Método para definir o gênero do filme
    public void setGenero(String genero) {
        if (genero != null && (genero.equalsIgnoreCase("Romance") ||
                genero.equalsIgnoreCase("Terror") ||
                genero.equalsIgnoreCase("Comedia"))) {
            this.genero = genero; // Atualiza o gênero se for válido
        } else {
            System.out.println("Gênero inválido. Tente novamente."); // Mensagem de erro
        }
    }

    // Método para definir a duração do filme
    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao; // Atualiza a duração se for positiva
        }
    }

    // Método para obter o nome do filme
    public String getNome() {
        return nome; // Retorna o nome do filme
    }

    // Método para obter o gênero do filme
    public String getGenero() {
        return genero; // Retorna o gênero do filme
    }

    // Método para obter a duração do filme formatada em horas e minutos
    public String getDuracao() {
        int horas = duracao / 60; // Calcula as horas
        int min = duracao % 60; // Calcula os minutos restantes
        return String.format(horas + ":" + min); // Formata a saída como "hh:mm"
    }
}

public class Cinema {
    public static void main(String[] args) {
        // Criando uma nova instância de Filme com dados diretos
        Filme filme = new Filme("Inception", "Terror", 148);

        // Exibe os detalhes do filme
        System.out.println("\n\nNome do filme: " + filme.getNome() +
                "\nGênero do filme: " + filme.getGenero() +
                "\nDuração do filme: " + filme.getDuracao());
    }
}
