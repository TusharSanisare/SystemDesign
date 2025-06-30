package LLD.FactoryDesignPattern.SimpleFactory;

public class Main {
  public static void main(String[] args) {
    BurgerFactory burgerFactory = new BurgerFactory();
    Burger burger = burgerFactory.getBurger("chees");

    burger.getBurger();
  }
}
