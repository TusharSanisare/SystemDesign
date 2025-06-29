public class IronMan implements HeroInterface {

  private String name = "Iron Man";
  private String power = "Genious millionaire playboy";

  @Override
  public String getHeroName() {
    return name;
  }

  @Override
  public String getHeroPower() {
    return power;
  }

}
