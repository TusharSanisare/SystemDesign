package LLD.FactoryDesignPattern.AbstractFactory;

public class Main {
  public static void main(String[] args) {
    Factory factory = new HPFactory();
    Product product = factory.getLaptop("gamming");

    product.getProduct();
  }
}
