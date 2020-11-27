public class RealNumber extends Number {

    private double value;

    public RealNumber(double v){
        value = v;
    }
    public double getValue(){
        return value;
    }

    public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
      boolean result = false;
      double a = this.getValue();
      double b = other.getValue();
      double valueA = (Math.abs(a-b)/a)*100;
      double valueB = (Math.abs(b-a)/b)*100;
      if (a == 0 && b == 0) return result =true;
      if (valueA< 0.00001 && valueA < 0.00001) return result=true;
      return result;
  }

  public RealNumber add(RealNumber other){
     return new RealNumber(this.getValue() + other.getValue());
  }

  public RealNumber multiply(RealNumber other){
    return new RealNumber(this.getValue() * other.getValue());
  }

  public RealNumber divide(RealNumber other){
       return new RealNumber(this.getValue()/ other.getValue());
 }


  public RealNumber subtract(RealNumber other){
    return new RealNumber(this.getValue() - other.getValue());
  }



}
