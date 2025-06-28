
public interface ObservableInterface {

  void addObserver(ObserverInterface observer);

  void removeOberver(ObserverInterface observer);

  void notifyObservers();

}
