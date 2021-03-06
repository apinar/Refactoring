package intervals;

public class Both_opened extends Interval{

	public Both_opened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
		return getPoint().getMinimum() < value && value < getPoint().getMaximum();
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean includes(Both_opened interval) {
		maxMinIncluded(interval);
		return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
				&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
		
		
	}

	@Override
	public boolean includes(Left_opened interval) {
		maxMinIncluded(interval);
		return (minimumIncluded || getPoint().getMinimum() == interval.getPoint().getMinimum())
				&& (maximumIncluded);
	}

	@Override
	public boolean includes(Right_opened interval) {
		maxMinIncluded(interval);
		return (minimumIncluded)
				&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
	}

	@Override
	public boolean includes(Unopened interval) {
		maxMinIncluded(interval);
		return (minimumIncluded) && (maximumIncluded);
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		return !this.checkLeft(interval) && !this.checkRight(interval) && (this.includes(interval.getPoint().getMinimum())
				|| this.includes(interval.getPoint().getMaximum()));
	}

}
