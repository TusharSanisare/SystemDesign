class Main {
  public static void main(String[] args) {
    System.out.println("hey...");

    HeroInterface hero1 = new GunPower(new FlyPower(new IronMan()));
    HeroInterface hero2 = new WebPower(new GunPower(new SpiderMan()));

    System.out.println("Hero 1: " + hero1.getHeroName() + " with powers: " + hero1.getHeroPower());
    System.out.println("Hero 2: " + hero2.getHeroName() + " with powers: " + hero2.getHeroPower());
  }
}