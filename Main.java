public class Main {
    public static void main(String[] args) {
        
        String[] paymentMethods = {"pix", "debito", "credito"};
        
        for (String method : paymentMethods) {
            ConcreteCreator creator = new ConcreteCreator(method);
            String result = creator.someOperation();
            System.out.println(result);
        }
    }
}