public class Leite extends CondimentoDecorator {
    public Leite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", com Leite";
    }

    @Override
    public double getCusto() {
        return bebidaDecorada.getCusto() + 1.50;
    }
}