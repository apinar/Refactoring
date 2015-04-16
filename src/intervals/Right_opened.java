package intervals;

public class Right_opened extends Interval{

	public Right_opened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
		return getPoint().getMinimum() <= value && value < getPoint().getMaximum();
	}

	/*@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getPoint().getMinimum());
		boolean maximumIncluded = this.includes(interval.getPoint().getMaximum());
		switch (interval.getOpening()) {
		case BOTH_OPENED:
			return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
					&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
		case LEFT_OPENED:
			return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
					&& (maximumIncluded);
		case RIGHT_OPENED:
			return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
					&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
		case UNOPENED:
			return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
					&& (maximumIncluded);
		default:
			assert false;
			return false;
		}
	}*/

	@Override
	public boolean includes(Both_opened interval) {
		boolean minimumIncluded = this.includes(interval.getPoint().getMinimum());
		boolean maximumIncluded = this.includes(interval.getPoint().getMaximum());
		return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
				&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
	}

	@Override
	public boolean includes(Left_opened interval) {
		boolean minimumIncluded = this.includes(interval.getPoint().getMinimum());
		boolean maximumIncluded = this.includes(interval.getPoint().getMaximum());
		return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
				&& (maximumIncluded);
	}

	@Override
	public boolean includes(Right_opened interval) {
		boolean minimumIncluded = this.includes(interval.getPoint().getMinimum());
		boolean maximumIncluded = this.includes(interval.getPoint().getMaximum());
		return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
				&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
	}

	@Override
	public boolean includes(Unopened interval) {
		boolean minimumIncluded = this.includes(interval.getPoint().getMinimum());
		boolean maximumIncluded = this.includes(interval.getPoint().getMaximum());
		return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
				&& (maximumIncluded);
	}

}
