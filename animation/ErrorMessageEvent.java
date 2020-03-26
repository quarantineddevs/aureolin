package animation;

import rendering.AFrame;

// TODO: Add superclass and create threading, as many failed to do before.

public class ErrorMessageEvent {
	
	public ErrorMessageEvent(AFrame frame, String message) {
		frame.raiseScreenError(message);
	}

}
