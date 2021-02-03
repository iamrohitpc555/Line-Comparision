public class LineComparision{
 
    double x1, x2, y1, y2, x3, x4, y3, y4;
    double lineOneLength, lineTwoLength;

    public double lineOneCal(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        
       double length1=Math.sqrt((x2-x1)*(x2-x1));
        return length1;
    }

    public double lineTwoCal(double x3, double x4, double y3, double y4) {
        this.x3 = x3;
        this.x4 = x4;
        this.y3 = y3;
        this.y4 = y4;
        

        double length2=Math.sqrt((y2-y1)*(y2-y1));
        return length2;
    }

    public static void main(String[] args) {
        LineComparision l = new LineComparision();
        double lengthOne = l.lineOneCal(2, 4, 5, 7);
        double lengthTwo = l.lineTwoCal(4, 6, 9, 11);
        String length1 = String.valueOf(lengthOne);
        String length2 = String.valueOf(lengthTwo);
        double result = length1.compareTo(length2);
        if (result == 0) {
            System.out.println("The Two Line Are Equal");
        } else if (result > 0) {
            System.out.println("LineOne is greater than LineTwo");

        } else {
            System.out.println("LineTwo is greater than LineOne");
        }
    }
}
