package BuscadorDeCep.modelos;

public record InfoCep(String cep, String logradouro, String bairro, String localidade, String uf) {
    @Override
    public String toString() {
        return "\n Cep: " + cep + "\n Bairro: " +bairro+ "\n Rua: " + logradouro + "\n Cidade: " + localidade + "\n Estado: " + uf;
    }
}
