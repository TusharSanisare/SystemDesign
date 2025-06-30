package LLD.FactoryDesignPattern.SimpleFactory;

public class BurgerFactory {
  public Burger getBurger(String burger) {
    switch (burger) {
      case "simple":
        return new SimpleBurger();
      case "chees":
        return new CheesBurger();
      default:
        return null;
    }
  }
}
