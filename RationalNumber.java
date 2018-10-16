public class RationalNumber extends RealNumber {
	private int p,q;

	public RationalNumber(int in,int in2) {
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
		return(new RationalNumber(this.p * other.getNumerator(), this.q * other.getDenominator()));
	}

	public RationalNumber divide(RationalNumber other){
		return(new RationalNumber(this.p / other.getDenominator(), this.q / other.getNumerator()));
 	}

	public RationalNumber add(RationalNumber other){
		RationalNumber one = new RationalNumber(this.p * other.getDenominator(), this.q * other.getDenominator());
		RationalNumber two = new RationalNumber(other.getNumerator() * this.q, other.getDenominator() * this.q);
		
		RationalNumber sum = new RationalNumber(one.getNumerator() + two.getNumerator(), one.getDenominator());
		sum.reduce();
		
		return sum;	
	}

	public RationalNumber subtract(RationalNumber other){
		RationalNumber one = new RationalNumber(this.p * other.getDenominator(), this.q * other.getDenominator());
		RationalNumber two = new RationalNumber(other.getNumerator() * this.q, other.getDenominator() * this.q);
		
		RationalNumber difference = new RationalNumber(one.getNumerator() - two.getNumerator(), one.getDenominator());
		difference.reduce();
		
		return difference;
	}

	public RationalNumber reciprocal(){
		return(new RationalNumber(q,p));
	}

	private static int gcd(int a, int b){
		if(a == 0 || b == 0) {
			return 0;
		}	
		if(a == b) {
			return a;
		}
		if(a > b) {
			return(gcd(a-b,b));
		}
		else {
			return(gcd(a,b-a));
		}
	}

	private void reduce(){
		int g = gcd(p,q);
		p /= g;
		q /= g;
	}

	public boolean equals(RationalNumber other){
		this.reduce();
		other.reduce();
		
		if(this.p == other.getNumerator() && this.q == other.getDenominator()) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString(){
		return ("" + p + "/" + q);
	}

}
