public class WebPower extends HeroDecoratorInterface {

  WebPower(HeroInterface hero) {
    this.hero = hero;
  }

  @Override
  public String getHeroName() {
    return hero.getHeroName();
  }

  @Override
  public String getHeroPower() {
    return hero.getHeroPower() + " and Web Power";
  }
}
