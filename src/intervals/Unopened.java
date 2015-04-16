package intervals;

public class Unopened extends Interval{

	public Unopened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
		return minimum <= value && value <= maximum;
	}

}
