package messages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotificationCenter {
	
	//Static body
	
	private static NotificationCenter nc;
	
	public static NotificationCenter getInstance() {
		if (nc == null)
			nc = new NotificationCenter();
		return nc;
	}
	
	//Instance body
	
	private Map<IObservable, List <IObservers>> costumers;
	
	public boolean subscribe(IObservable observable, IObservers observer) {
		List <IObservers> observers = costumers.get(observable);
		if (observers == null) {
			observers = new ArrayList<IObservers>();
			costumers.put(observable, observers);
		}
		return observers.add(observer);
	}
	
	public boolean unsubscribe(IObservable observable, IObservers observer) {
		List <IObservers> observers = costumers.get(observable);
		if (observers == null)
			return false;
		return observers.remove(observer);
	}
	
	public boolean notify(IObservable observable, Message message) {
		List <IObservers> observers = costumers.get(observable);
		if (observers == null)
			return false;
		for (IObservers observer:observers) {
			observer.notify(observable, message);
		}
		return true;
	}

}
