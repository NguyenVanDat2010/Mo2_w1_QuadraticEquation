public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return this.a;
    }

    double getB() {
        return this.b;
    }

    double getC() {
        return this.c;
    }

    double getDiscriminant() {
        double delta = ((this.b * this.b) - (4 * this.a * this.c));
        if (delta > 0) {
            return 1;
        }if (delta==0){
            return 0;
        }
        else {
            return -1;
        }
    }

    double getRoot1() {
        double x1 = ((-this.b) + (Math.sqrt(((this.b * this.b) - (4 * this.a * this.c))))) / 2 * this.a;
        return x1;
    }

    double getRoot2() {
        double x2 = ((-this.b) - (Math.sqrt(((this.b * this.b) - (4 * this.a * this.c))))) / 2 * this.a;
        return x2;
    }

    void resultRoot(){
        System.out.println("Phương trình bậc hai "+this.a+"X2 + "+this.b+"X +"+this.c+" = 0 là:");
        if (this.a==0){
            System.out.println("Phương trình vô nghiệm");
        }else
        if (getDiscriminant()>0){
            System.out.println("Phương trình có 2 nghiệm: "+"x1= "+getRoot1()+" và x2= "+getRoot2());
        }else
            if (getDiscriminant()==0){
                System.out.println("Phương trình có nghiệm kép x1 = x2 = "+getRoot1());
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
    }
}


