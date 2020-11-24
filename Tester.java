
public class Tester {
    public static void main (String[]args){

        //RealNumber only tests
        System.out.println();
        System.out.println("----------RealNumber only tests----------");
        System.out.println("----------Equals tests----------");
        RealNumber a1 = new RealNumber(0);
        RealNumber b1 = new RealNumber (0.00000000001);
        System.out.println("0 case test. Expected false | Output " + a1.equals(b1));
        RealNumber c1 = new RealNumber(100000);
        RealNumber d1 = new RealNumber (99998);
        System.out.println("100,000 and 99,998 case. Expected false | Output " + c1.equals(d1));
        System.out.println();


        System.out.println("----------Arithmetic tests----------");
        RealNumber moo1 = new RealNumber(3934);
        RealNumber boo1 = new RealNumber(21);
        System.out.println("3934 + 21. Expected 3955.0 | Output " + moo1.add(boo1));
        System.out.println("3934 - 21. Expected 3913.0 | Output " + moo1.subtract(boo1));
        System.out.println("3934 * 21. Expected 82614.0 | Output " + moo1.multiply(boo1));
        System.out.println("3934 / 21. Expected 187.33333333333334 | Output " + moo1.divide(boo1));
        System.out.println();
        //

        // RationalNumber only tests
        System.out.println("----------RationalNumber only tests----------");
        System.out.println("----------Constructor tests----------");
        RationalNumber a = new RationalNumber(3, -5);
        RationalNumber b = new RationalNumber(-6, -10);
        RationalNumber c = new RationalNumber(394839, 0);
        RationalNumber d = new RationalNumber(0, 35);
        RationalNumber e = new RationalNumber(0, 0);
        RationalNumber f = new RationalNumber(100, 100);
        RationalNumber g = new RationalNumber(39, 156);
        System.out.println("Init : 3/-5. Expected -3/5 | Output " + a.toString());
        System.out.println("Init : -6/-10. Expected 3/5 | Output " + b.toString());
        System.out.println("Init : 394839/0. Expected 0/1 | Output " + c.toString());
        System.out.println("Init : 0/-35. Expected 0/1 | Output " + d.toString());
        System.out.println("Init : 0/0. Expected 0/1 | Output " + e.toString());
        System.out.println("Init : 100/100. Expected 1/1 | Output " + f.toString());
        System.out.println("Init : 39/156. Expected 1/4 | Output " + g.toString());
        System.out.println();

        System.out.println("----------Equals tests----------");
        RationalNumber moo = new RationalNumber(-10,-20);
        RationalNumber boo = new RationalNumber(40,80);
        System.out.println("Comparing -10/-20 to 40/80. Expected true | Output " + moo.equals(boo));
        System.out.println();

        System.out.println("----------Reciprocal/Multiplication/Division tests----------");
        System.out.println("Reciprocal of -10/-20. Expected 2/1 | Output " + moo.reciprocal());
        System.out.println("-10/-20 * 40/80. Expected 1/4 | Output " + moo.multiply(boo));
        RationalNumber zoo = new RationalNumber(40, 240);
        System.out.println("-10/-20 / 40/240. Expected 3/1 | Output " + moo.divide(zoo));
        RationalNumber goo = new RationalNumber(1, 0);
        System.out.println("40/240 / 1/0. Expected 0/1 | Output " + zoo.divide(goo));
        System.out.println();

        System.out.println("----------Addition/Subtraction tests----------");
        RationalNumber gloo = new RationalNumber(30,-50);
        RationalNumber foo = new RationalNumber(64,80);
        System.out.println("30/-50 + 64/80. Expected 1/5 | Output " + gloo.add(foo));
        System.out.println("30/50 + 64/80. Expected 7/5 | Output " + gloo.multiply(new RationalNumber(-1,1)).add(foo));
        System.out.println("30/-50 - 63/81. Expected -7/5 | Output " + gloo.subtract(foo));
        System.out.println("30/50 - 63/81. Expected -1/5 | Output " + gloo.multiply(new RationalNumber(-1,1)).subtract(foo));
        System.out.println();
        //

        // RationalNumber and RealNumber mix tests.
        System.out.println("----------RealNumber comparsion to RationalNumber----------");
        RealNumber k = new RealNumber(.3333333333);
        RationalNumber m = new RationalNumber(1,3);
        System.out.println("Comparing .3333333333 to 1/3. Expected true | Output " +k.equals(m));
        RealNumber woj = new RealNumber(1.5);
        RationalNumber sham = new RationalNumber(3, 2);
        System.out.println("Adding 1.5 and 3/2. Expected 3.0 | Output " + woj.add(sham));
        System.out.println("Subtracting 1.5 from 3/2. Expected 0.0 | Output " + woj.subtract(sham));
        System.out.println("Multiplying 1.5 and 3/2. Expected 2.25 | Output " + woj.multiply(sham));
        System.out.println("Dividing 1.5 by 3/2. Expected 1.0 | Output " + woj.divide(sham));
        //

        RationalNumber man = new RationalNumber(10,4);
        man.reduce();
        System.out.println("TEster number is:" + man);

// this is Steven's Lei's tester
    }
}
