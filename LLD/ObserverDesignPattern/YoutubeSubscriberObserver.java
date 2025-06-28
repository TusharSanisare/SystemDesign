
public class YoutubeSubscriberObserver implements ObserverInterface {

  private String subscriberName;
  private YoutubeChannelObservable observable;

  public YoutubeSubscriberObserver(String name, YoutubeChannelObservable observable) {
    this.subscriberName = name;
    this.observable = observable;
  }

  @Override
  public void update(String message) {
    System.out.println("Hey " + subscriberName + "... " + message + " " + observable.getUpdate());
  }
}
