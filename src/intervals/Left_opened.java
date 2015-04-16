package intervals;

public class Left_opened extends Interval{

	public Left_opened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
		return getPoint().getMinimum() < value && value <= getPoint().getMaximum();
	}

	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getPoint().getMinimum());
		boolean maximumIncluded = this.includes(interval.getPoint().getMaximum());
		switch (interval.getOpening()) {
		case BOTH_OPENED:
			return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
					&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
		case LEFT_OPENED:
			return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
					&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
		case RIGHT_OPENED:
			return (minimumIncluded)
					&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
		case UNOPENED:
			return (minimumIncluded)
					&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
		default:
			assert false;
			return false;
		}
	}

	@Override
	public void includes(Both_opened interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void includes(Left_opened interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void includes(Right_opened interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void includes(Unopened interval) {
		// TODO Auto-generated method stub
		
	}

}
