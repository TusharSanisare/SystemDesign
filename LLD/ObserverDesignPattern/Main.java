
class Main {
  public static void main(String[] args) {
    // System.out.println("Hello, World!");
    YoutubeChannelObservable channel = new YoutubeChannelObservable("CodeWithMe");
    ObserverInterface subscriber1 = new YoutubeSubscriberObserver("Alice", channel);
    ObserverInterface subscriber2 = new YoutubeSubscriberObserver("Bob", channel);

    channel.addObserver(subscriber1);
    channel.addObserver(subscriber2);

    channel.setUpdateOnChannel("New video uploaded on Java Design Patterns!");
    channel.setUpdateOnChannel("New video uploaded on Observer Pattern!");
    channel.removeOberver(subscriber1);
    channel.setUpdateOnChannel("New video uploaded on Java Streams!");

  }
}