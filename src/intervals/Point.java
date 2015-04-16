package intervals;

public class Point {
	private double minimum;
	private double maximum;
	
	public Point(double minimum, double maximum) {
		this.setMinimum(minimum);
		this.setMaximum(maximum);
	}
	
	public double getMinimum() {
		return minimum;
	}
	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}
	public double getMaximum() {
		return maximum;
	}
	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}

	public double midPoint() {
		return (getMaximum() + getMinimum()) / 2;
	}	

}
