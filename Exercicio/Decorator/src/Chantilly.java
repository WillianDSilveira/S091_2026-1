public class Chantilly extends CondimentoDecorator {
    public Chantilly(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", com Chantilly";
    }

    @Override
    public double getCusto() {
        return bebidaDecorada.getCusto() + 1.00;
    }
}