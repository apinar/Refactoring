package intervals;

public class Right_opened extends Interval{

	public Right_opened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
		return getPoint().getMinimum() <= value && value < getPoint().getMaximum();
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean includes(Both_opened interval) {
		boolean minimumIncluded = interval.includes(this.getPoint().getMinimum());
		boolean maximumIncluded = interval.includes(this.getPoint().getMaximum());
		return (minimumIncluded)
				&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
	}

	@Override
	public boolean includes(Left_opened interval) {
		boolean minimumIncluded = interval.includes(this.getPoint().getMinimum());
		boolean maximumIncluded = interval.includes(this.getPoint().getMaximum());
		return (minimumIncluded &&  getPoint().getMinimum() != interval.getPoint().getMinimum())
				&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
	}

	@Override
	public boolean includes(Right_opened interval) {
		boolean minimumIncluded = interval.includes(this.getPoint().getMinimum());
		boolean maximumIncluded = interval.includes(this.getPoint().getMaximum());
		return (minimumIncluded)
				&& (maximumIncluded || getPoint().getMaximum() == interval.getPoint().getMaximum());
	}

	@Override
	public boolean includes(Unopened interval) {
		boolean minimumIncluded = interval.includes(this.getPoint().getMinimum());
		boolean maximumIncluded = interval.includes(this.getPoint().getMaximum());
		return (minimumIncluded)
				&& (maximumIncluded);
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

}
