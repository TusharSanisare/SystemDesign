public class GunPower extends HeroDecoratorInterface {

  GunPower(HeroInterface hero) {
    this.hero = hero;
  }

  @Override
  public String getHeroName() {
    return hero.getHeroName();
  }

  @Override
  public String getHeroPower() {
    return hero.getHeroPower() + " and Gun Power";
  }

}
