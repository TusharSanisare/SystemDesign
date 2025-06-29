public class FlyPower extends HeroDecoratorInterface {

  FlyPower(HeroInterface hero) {
    this.hero = hero;
  }

  @Override
  public String getHeroName() {
    return hero.getHeroName();
  }

  @Override
  public String getHeroPower() {
    return hero.getHeroPower() + " and Fly Power";
  }
}
