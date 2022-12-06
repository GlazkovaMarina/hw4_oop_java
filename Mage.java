
public class Mage extends Warrior <Staff, MetalBuckler>{
    private int range;
    private int mana;
    public Mage(String name, Staff weapon, MetalBuckler buckler, int healthPoint, int range, int mana) {
        super(name, weapon, buckler, healthPoint);
        this.range = range;
        this.mana = mana;
    }
    @Override
    public String toString() {
        return String.format("Mage: %s, range: %d, mana: %d", super.toString(), this.range, this.mana);
    }
    public int getRange() {
        return range;
    }
    public void setRange(int range) {
        this.range = range;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    
}
