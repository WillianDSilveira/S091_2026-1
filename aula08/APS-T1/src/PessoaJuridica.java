public class PessoaJuridica extends Pessoa {
    private String cnpj;

    @Override
    public Float getValorParaRelatorio() {
        return null;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}