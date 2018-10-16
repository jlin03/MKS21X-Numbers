public class RationalNumber extends RealNumber {
	private int p,q;

	public RationalNumber(double in,double in2) {
		super(0);
		p = in;
		q = in2;
	}

	public double getValue(){
    return (p/q);
  }

	public int getNumerator(){
	 return p;
 	}

 	public int getDenominator(){
	 	return q;
 	}

	public RationalNumber multiply(RationalNumber other){
    return(new RationalNumber(this.p * other.getNumerator(),this.q * other.getDenominator()));
  }

	public RationalNumber divide(RationalNumber other){
	 return(new RationalNumber(multiply(reciprocal(other.getNumerator())),multiply(reciprocal(other.getDenominator()))));
 	}

	public RationalNumber add(RationalNumber other){
    return null;
  }

	public RationalNumber subtract(RationalNumber other){
    return null;
  }

	public RationalNumber reciprocal(){
    return(new RationalNumber(q,p));
  }

	private static int gcd(int a, int b){
    return 0;
  }

	private void reduce(){

  }

	public boolean equals(RationalNumber other){
    return false;
  }

	public String toString(){
    return ("" + p + "/" + q);
  }

}
