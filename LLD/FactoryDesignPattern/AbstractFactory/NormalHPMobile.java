package LLD.FactoryDesignPattern.AbstractFactory;

public class NormalHPMobile implements Product {
  @Override
  public void getProduct() {
    System.out.println("HP normal mobile");
  }
}
