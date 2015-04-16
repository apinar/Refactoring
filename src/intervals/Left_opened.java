package intervals;

public class Left_opened extends Interval{

	public Left_opened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
		// TODO Auto-generated method stub
		return false;
	}

}
