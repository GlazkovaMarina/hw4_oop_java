import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T>{
    private Hero hero;
    private List <T> teamList = new ArrayList<T>();
    public Team(Hero hero) {
        this.hero = hero;
    }
    public void add(T member){
        teamList.add(member);
    }
    @Override
    public Iterator<T> iterator() {
        return teamList.iterator();
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(hero.toString() + "\n");
        for (T member : teamList) {
            builder.append(member.toString() + "\n");
        }
        return builder.toString();
    }
    public int getTeamHealthPoint(){
        int sum = hero.getHealthPoint();
        for (T member : teamList) {
            sum += member.getHealthPoint();
        }
        return sum;
    }

}
