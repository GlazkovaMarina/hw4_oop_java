public class Bow implements Weapon{
    @Override
    public int damage() {
        return 30;
    }
    @Override
    public String toString() {
        return String.format("Bow: %d", this.damage());
    }
}
