public class Chocolate extends CondimentoDecorator {
    public Chocolate(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", com Chocolate";
    }

    @Override
    public double getCusto() {
        return bebidaDecorada.getCusto() + 2.00;
    }
}