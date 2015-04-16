package intervals;

public abstract class Interval {

	private Opening opening;
	private Point point;

	public Interval(double minimum, double maximum, Opening opening) {
		this.setPoint(new Point(minimum,maximum));
		this.setOpening(opening);
	}

	public double midPoint() {
		return getPoint().midPoint();
	}

	public abstract boolean includes(double value) ;
	

	public abstract boolean includes(Interval interval) ; 
	
	public abstract boolean includes(Both_opened interval);
	public abstract boolean includes(Left_opened interval);
	public abstract boolean includes(Right_opened interval);
	public abstract boolean includes(Unopened interval);
	

	public boolean intersectsWith(Interval interval) {
		return false;
		/*if (getPoint().getMinimum() == interval.getPoint().getMaximum()) {
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
				*/
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
