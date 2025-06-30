package LLD.FactoryDesignPattern.FactoryMethod;

public class MCBurgerFactory implements BurgerFactoryInterface {
  public Burger makeBurger(String burger) {
    switch (burger) {
      case "simple":
        return new MCSimpleBurger();
      case "chees":
        return new MCCheesBurger();
      default:
        return null;
    }
  }
}
