public class Hero extends Warrior<Weapon, Buckler>{

    public Hero(String name, Weapon weapon, Buckler buckler, int healthPoint) {
        super(name, weapon, buckler, healthPoint);
    }
    @Override
    public String toString() {
        return String.format("Hero: %s", super.toString());
    }

}
