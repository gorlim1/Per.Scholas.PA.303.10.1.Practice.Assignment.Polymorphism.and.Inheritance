public class StoneMonster extends Monster {

    public StoneMonster(String name) {

        this.monsterName = name;
    }

    @Override
    public String attack() {

        return "Attack with stones!";
    }
}
