
package length;

public class Length {
    public static final int INCHES_IN_A_FOOT=12;
    
    private int feet;
    private int inches;
    
    public Length( int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }
    public double toDecimal(){
        return this.feet + ((double) this.inches) / INCHES_IN_A_FOOT;
    }
    public Length add(Length other) {
        int totalFeet = this.getFeet() + other.getFeet();
        int totalInches = this.getInches() + other.getInches();
        
        int f = totalFeet + totalInches / INCHES_IN_A_FOOT;
        int i = totalInches % INCHES_IN_A_FOOT;
        
        return new Length(f,i);
    }
    
    @Override
    public String toString(){
        return this.getFeet() + " feet, " + this.getInches() + " inches";
    }
    
    public static void main(String[] args) {
        System.out.println("Hello");
        Length a=new Length(5, 11);
        System.out.println(a);
        Length b = new Length(3, 6);
        Length sum = a.add(b);
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(sum.toDecimal()+" feet");
    }

    /**
     * @return the feet
     */
    public int getFeet() {
        return feet;
    }

    /**
     * @return the inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) {
        this.inches = inches;
    }
    
}
