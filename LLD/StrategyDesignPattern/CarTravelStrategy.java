public class CarTravelStrategy implements TravelStrategy {

  @Override
  public void travel(String source, String destination) {
    System.out.println(
        "Traveling from " + source + " to " + destination + " by Car. Estimated time: X hours. Cost: ₹X");
  }

}
