/*
 * 1 Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
 * Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
 * На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п. У лучника добавить поле расстояние поражения. 
 * Создать различные виды вооружения, например, меч, лук, лопата. Обеспечить, чтобы определенный тип воина мог нести только определенной оружие
 * Создать класс командира
 */

 /**
  * Warrior
  */
 public abstract class Warrior <T extends Weapon, E extends Buckler> {
    private String name;
    private T weapon;
    private E buckler;
    private int healthPoint;

    public Warrior(String name, T weapon, E buckler, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.buckler = buckler;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }
  
    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    @Override
    public String toString() {
        return String.format("name: %s, weapon: %s, buckler: %s, healthPoint: %d", this.name, this.weapon, this.buckler, this.healthPoint);
    }

    public E getBuckler() {
        return buckler;
    }

    public void setBuckler(E buckler) {
        this.buckler = buckler;
    }
    
 }