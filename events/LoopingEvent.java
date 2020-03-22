package events;

public abstract class LoopingEvent extends TimedEvent {
	
	// For events that start, run on their own, and then are restarted
	
	public LoopingEvent(int time) {
		super(time);
	}
	
	// Because these things have nothing to update every frame
	@Override
	public void frame(int time) {}

}
