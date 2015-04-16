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
	
	public abstract boolean intersectsWith(Interval interval); 
	

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
 
	public boolean checkLeft(Interval interval){
		return this.getPoint().getMaximum() == interval.getPoint().getMinimum();
	}
	
	public boolean checkRight(Interval interval){
		return this.getPoint().getMinimum() == interval.getPoint().getMaximum();
	}
	
	
}
