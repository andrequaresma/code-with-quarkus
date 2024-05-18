package ArqHexagonalApplication;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped public class EnriqueceToken {

    public String tokenEnriquecido(Entrada entrada){
        return "O protocolo retornou uma autenticação válida para o nome: " + entrada.getNome() + " \nNúmero: " + entrada.getNumero();
    }
}
