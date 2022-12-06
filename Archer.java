public class Archer extends Warrior <Bow, WoodBuckler>{
    private int range;
    public Archer(String name, Bow weapon, WoodBuckler buckler, int healthPoint, int range) {
        super(name, weapon, buckler, healthPoint);
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, range: %d", super.toString(), this.range);
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    
}
