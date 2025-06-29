public class AirplaneTravelStrategy implements TravelStrategy {

  @Override
  public void travel(String source, String destination) {
    System.out.println(
        "Traveling from " + source + " to " + destination + " by Airplane. Estimated time: X hours. Cost: ₹X");
  }

}
