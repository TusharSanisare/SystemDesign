
import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelObservable implements ObservableInterface {

  private List<ObserverInterface> observers = new ArrayList<>();
  private String channelName;
  private String channelUpdate;

  public YoutubeChannelObservable(String channelName) {
    this.channelName = channelName;
  }

  @Override
  public void addObserver(ObserverInterface observer) {
    observers.add(observer);
  }

  @Override
  public void removeOberver(ObserverInterface observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (ObserverInterface observer : observers) {
      observer.update("new update on channel: " + channelName);
    }
  }

  public void setUpdateOnChannel(String message) {
    this.channelUpdate = message;
    notifyObservers();
  }

  public String getUpdate() {
    return channelUpdate;
  }
}
