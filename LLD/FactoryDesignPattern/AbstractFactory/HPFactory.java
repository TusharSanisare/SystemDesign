package LLD.FactoryDesignPattern.AbstractFactory;

public class HPFactory implements Factory {
  public Product getLaptop(String type) {
    switch (type) {
      case "normal":
        return new NormalHPMobile();
      case "gamming":
        return new GammingHPMobile();

      default:
        return null;
    }
  }

  public Product getMobile(String type) {
    switch (type) {
      case "normal":
        return new NormalHPLaptop();
      case "gamming":
        return new GammingHPLaptop();

      default:
        return null;
    }
  }
}
