package ucdb.br.sweccamobile.model;

/**
 * Created by drago on 03/10/2017.
 */

public class Endereco {

    private Integer id;
    private String rua;
    private String estado;
    private String cidade;
    private String cep;
    private String bairro;
    private String numero;

    public Endereco(String rua, String estado, String cidade, String cep, String bairro, String numero) {
        this.rua = rua;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
    }

    public Endereco() {
    }
}
