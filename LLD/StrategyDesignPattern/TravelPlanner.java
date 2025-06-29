public interface TravelPlanner {

  void setStrategy(TravelStrategy strategy);

  void planJourney(String source, String destination);

}