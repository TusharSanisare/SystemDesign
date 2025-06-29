public class Main {
  public static void main(String[] args) {
    TravelPlanner travelPlanner = new TravelPlannerClass();
    TravelStrategy busStrategy = new BusTravelStrategy();
    TravelStrategy airplaneStrategy = new AirplaneTravelStrategy();
    TravelStrategy carStrategy = new CarTravelStrategy();

    travelPlanner.setStrategy(busStrategy);
    travelPlanner.planJourney("City A", "City B");
    travelPlanner.setStrategy(airplaneStrategy);
    travelPlanner.planJourney("City A", "City B");
    travelPlanner.setStrategy(carStrategy);
    travelPlanner.planJourney("City A", "City B");
  }
}
