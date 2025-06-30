package LLD.FactoryDesignPattern.FactoryMethod;

public class Main {
  public static void main(String[] args) {
    BurgerFactoryInterface burgerFactory1 = new MCBurgerFactory();
    Burger burger1 = burgerFactory1.makeBurger("chees");

    burger1.getBurger();

    BurgerFactoryInterface burgerFactory2 = new KFCBurgerFactory();
    Burger burger2 = burgerFactory2.makeBurger("simple");

    burger2.getBurger();
  }
}
