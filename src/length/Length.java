
package length;

public class Length {
    public static final int INCHES_IN_A_FOOT=12;
    
    private int feet;
    private int inches;
    
    public Length( int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }
    
    @Override
    public String toString(){
        return this.feet + " feet, " + this.inches + " inches";
    }
    
    public static void main(String[] args) {
        System.out.println("Hello");
        Length a=new Length(5, 11);
        System.out.println(a);
    }
    
}
