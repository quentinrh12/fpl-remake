public class Player {

    private String Name = null;
    private Integer Goals = null;
    private Integer Assists = null;
    private double XG;
    private double XA;
    private Integer Min = null;
    
    private double XC; // Expected Contributions: adding XG and XA
    private double XC90; // Expected Contributions per 90: divide XC by (minutes divided by 90)


    /*
    * String name == Representation of this Player's full name.
    * Integer goals == Number of goals scored by this Player.
    * Integer assists == Number of assists provided by this Player.
    * double xG == Number of expected Goals from this Player.
    * double xA == Number of expected Assists from this Player.
    * Integer min == Total minutes played in the current season by this Player.
    */
    public Player(String name, Integer goals, Integer assists, double xG, double xA, Integer min) {
        Name = name;
        Goals = goals;
        Assists = assists;
        XG = xG;
        XA = xA;
        Min = min;

        XC = XG + XA;
        XC90 = XC / (Min/90);



    }

    public String getName() {
        return this.Name;
    }

    public Integer getGoals() {
        return this.Goals;
    }

    public Integer getAssists() {
        return this.Assists;
    }

    public double getXG() {
        return this.XG;
    }

    public double getXA() {
        return this.XA;
    }

    public Integer getMin() {
        return this.Min;
    }

    public double getXC() {
        return this.XC;
    }

    public static void main(String args[]) {

    }
}