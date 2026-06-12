public abstract class CondimentoDecorator implements Bebida {
    protected Bebida bebidaDecorada; 

    public CondimentoDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public abstract String getDescricao();

    @Override
    public abstract double getCusto();
}