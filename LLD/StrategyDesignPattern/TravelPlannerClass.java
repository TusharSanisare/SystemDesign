public class TravelPlannerClass implements TravelPlanner {

  private TravelStrategy strategy;

  @Override
  public void setStrategy(TravelStrategy strategy) {
    this.strategy = strategy;
  }

  @Override
  public void planJourney(String source, String destination) {
    strategy.travel(source, destination);
  }

}
