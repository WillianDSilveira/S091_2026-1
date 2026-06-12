public class Expresso implements Bebida {
    @Override
    public String getDescricao() {
        return "Café Expresso";
    }

    @Override
    public double getCusto() {
        return 4.00;
    }
}