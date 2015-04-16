package intervals;

public abstract class Interval {

	//private double minimum;
	//private double maximum;
	private Opening opening;
	private Point point;

	public Interval(double minimum, double maximum, Opening opening) {
		this.setPoint(new Point(minimum,maximum));
		//this.setMinimum(minimum);
		//this.setMaximum(maximum);
		this.setOpening(opening);
	}

	public double midPoint() {
		return getPoint().midPoint();
		//return (getMaximum() + getMinimum()) / 2;
	}

	public abstract boolean includes(double value) ;
	

	public abstract boolean includes(Interval interval) ; 
	

	public boolean intersectsWith(Interval interval) {
		if (getPoint().getMinimum() == interval.getPoint().getMaximum()) {
			switch (getOpening()) {
			case BOTH_OPENED:
			case LEFT_OPENED:
				return false;
			case RIGHT_OPENED:
			case UNOPENED:
				return interval.getOpening() == Opening.LEFT_OPENED ||
						interval.getOpening() == Opening.UNOPENED;
			default:
				assert false;
				return false;
			}
		}
		if (getPoint().getMaximum() == interval.getPoint().getMinimum()) {
			switch (getOpening()) {
			case BOTH_OPENED:
			case RIGHT_OPENED:
				return false;
			case LEFT_OPENED:
			case UNOPENED:
				return interval.getOpening() == Opening.RIGHT_OPENED ||
						interval.getOpening() == Opening.UNOPENED;
			default:
				assert false;
				return false;
			}
		}
		return this.includes(interval.getPoint().getMinimum())
				|| this.includes(interval.getPoint().getMaximum());
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

	/*public double getMinimum() {
		return minimum;
	}

	private void setMinimum(double minimum) {
		this.minimum = minimum;
	}

	public double getMaximum() {
		return maximum;
	}

	private void setMaximum(double maximum) {
		this.maximum = maximum;
	}*/

	public Opening getOpening() {
		return opening;
	}

	public void setOpening(Opening opening) {
		this.opening = opening;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
