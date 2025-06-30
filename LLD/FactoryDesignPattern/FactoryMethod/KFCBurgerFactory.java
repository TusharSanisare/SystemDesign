package LLD.FactoryDesignPattern.FactoryMethod;

public class KFCBurgerFactory implements BurgerFactoryInterface {
  public Burger makeBurger(String burger) {
    switch (burger) {
      case "simple":
        return new KFCSimpleBurger();
      case "chees":
        return new KFCCheesBurger();
      default:
        return null;
    }
  }
}
