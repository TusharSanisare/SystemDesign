package LLD.FactoryDesignPattern.AbstractFactory;

public interface Factory {
  Product getLaptop(String type);

  Product getMobile(String type);
}
