package ArqHexagonalApplication;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Entrada {

    private String nome = "nome";
    private int numero = 123;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
