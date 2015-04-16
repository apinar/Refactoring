package intervals;

public class Both_opened extends Interval{

	public Both_opened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
		return minimum < value && value < maximum;;
	}

}
