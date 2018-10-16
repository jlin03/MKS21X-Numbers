public class RealNumber {
	private double a;

	public RealNumber(double in) {
		a = in;
	}

	public double getValue() {
		return a;
	}

	public RealNumber add(RealNumber other){
		return(new RealNumber(this.getValue() + other.getValue()));
	}

	public RealNumber subtract(RealNumber other){
		return(new RealNumber(this.getValue() - other.getValue()));
	}
	
	public RealNumber multiply(RealNumber other){
		return(new RealNumber(this.getValue() * other.getValue()));
	}
	
	public RealNumber divide(RealNumber other){
		return(new RealNumber(this.getValue() / other.getValue()));
	}

	public String toString(){
		return "" + a;
	}


}
