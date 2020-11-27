public class RationalNumber extends Number {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  */
 public RationalNumber(int nume, int deno){
     numerator = nume;
     denominator = deno;

    if (deno == 0) {
        numerator = 0;
        denominator = 1;
    }
    else if (nume == 0){
        denominator = 1;
        }
    else if (denominator < 0) {
        denominator = denominator * (-1);
        numerator = numerator * (-1);
        reduce();
    }
    else {
        reduce();
    }
  }

  public double getValue(){
    return ((double)numerator) / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(this.getDenominator(), this.getNumerator());
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator());
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
      int dividend = Math.abs(Math.min(a,b));
      int divisor = Math.abs(Math.max(a,b));
      int gcd = dividend;
      while (divisor % dividend !=0) {
          int remainder =  divisor% dividend;
          divisor = dividend;
          dividend = remainder;
          gcd = remainder;

      }
    return gcd;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  public void reduce(){
      int gcd = gcd(numerator,denominator);
      numerator =numerator/gcd;
      denominator =denominator/gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(this.getNumerator()*other.getNumerator(),this.getDenominator()*other.getDenominator());
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(this.getNumerator()*other.getDenominator(),this.getDenominator()*other.getNumerator());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return new RationalNumber((this.getNumerator() *other.getDenominator())+(other.getNumerator() *this.getDenominator()), other.getDenominator()*this.getDenominator());
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber((this.getNumerator() *other.getDenominator())-(other.getNumerator() *this.getDenominator()), other.getDenominator()*this.getDenominator());

  }
}
