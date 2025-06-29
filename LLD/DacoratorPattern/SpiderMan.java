public class SpiderMan implements HeroInterface {

  private String name = "Spider";
  private String power = "college kid";

  @Override
  public String getHeroName() {
    return name;
  }

  @Override
  public String getHeroPower() {
    return power;
  }
}
