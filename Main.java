public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hiro", new Staff(), new WoodBuckler(), 150);
        Team <Archer> red = new Team<>(hero1);
        red.add(new Archer("Man", new LongBow(), new WoodBuckler(), 100, 20));
        red.add(new Archer("Alex", new Bow(), new WoodBuckler(), 100, 15));
        System.out.println(hero1);
        for (Archer archer : red) {
            System.out.println(archer);
        }
        Hero hero2 = new Hero("Amir", new Staff(), new MetalBuckler(), 120);
        Team <Warrior> blue = new Team<>(hero2);
        blue.add(new Archer("Sem", new Bow(), new WoodBuckler(), 100, 10));
        blue.add(new Mage("Ron", new Staff(), new MetalBuckler(), 100, 15,30));
        System.out.println(blue);
        System.out.println(blue.getTeamHealthPoint());

        Team <Warrior> heros = new Team<>(hero1);
        blue.add(hero2);
         System.out.println(heros);
    }
}
