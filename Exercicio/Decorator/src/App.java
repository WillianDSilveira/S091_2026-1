public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("--- Pedidos da Cafeteria ---\n");

        Bebida pedido1 = new Expresso();
        imprimirPedido(pedido1);

        Bebida pedido2 = new Cappuccino();
        pedido2 = new Chantilly(pedido2);
        pedido2 = new Chantilly(pedido2);
        imprimirPedido(pedido2);

    
        Bebida cafe4 = new CafeNormal();
        cafe4 = new Leite(cafe4);
        cafe4 = new Chocolate(cafe4);
        imprimirPedido(cafe4);
    }

    private static void imprimirPedido(Bebida bebida) {
        System.out.println("Item: " + bebida.getDescricao());
        System.out.println("Total: R$ " + String.format("%.2f", bebida.getCusto()));
        System.out.println("-----------------------------------");
    }
}
