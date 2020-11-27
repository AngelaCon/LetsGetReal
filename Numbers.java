public abstract class Number {

     public abstract double getValue();

     public int compareTo(Number other){
         int result;
         if (this.getValue().equals(other)) result = 0;
         else if (this.getValue() < other.getValue()) result = -1;
         else if (this.getValue() > other.getValue()) result = 1;
         return result;
  }

  public boolean equals(Number other){
      boolean result = false;
      double a = this.getValue();
      double b = other.getValue();
      double valueA = (Math.abs(a-b)/a)*100;
      double valueB = (Math.abs(b-a)/b)*100;
      if (a == 0 && b == 0) return result =true;
      if (valueA< 0.00001 && valueA < 0.00001) return result=true;
      return result;
}

}
