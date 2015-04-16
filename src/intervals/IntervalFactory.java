package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		
		switch (opening){
		case BOTH_OPENED:
			return new Both_opened(minimum,maximum,opening);
		case LEFT_OPENED:
			return new Left_opened(minimum,maximum,opening);
		case RIGHT_OPENED:
			return new Right_opened(minimum,maximum,opening);
		case UNOPENED:
			return new Unopened(minimum,maximum,opening);
		default:	
			return null;
		}
	}
}
