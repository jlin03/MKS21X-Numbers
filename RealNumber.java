public class RealNumber {
	private double a;

	public RealNumber(double in) {
		a = in;
	}

	public double getValue() {
		return a;
	}

	public double add(RealNumber other){
    return(new RealNumber(this.getValue() + other.getValue()));
  }

	public double subtract(RealNumber other){
    return(new RealNumber(this.getValue() - other.getValue()));
  }

	public double multiply(RealNumber other){
    return(new RealNumber(this.getValue() * other.getValue()));
  }

	public double divide(RealNumber other){
    return(new RealNumber(this.getValue() / other.getValue()));
  }

	public String toString(){
    return ""+value;
  }


}
