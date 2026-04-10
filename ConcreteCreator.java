public class ConcreteCreator extends Creator {

    private String paymentMethod;

    public ConcreteCreator(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public Product factoryMethod() {
        switch (paymentMethod.toLowerCase()) {
            case "pix":
                return new ConcreteProductPix();
            case "debito":
                return new ConcreteProductDebito();
            case "credito":
                return new ConcreteProductCredito();
            default:
                throw new IllegalArgumentException("Método de pagamento não suportado: " + paymentMethod);
        }
    }
}