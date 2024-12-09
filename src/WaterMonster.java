public class WaterMonster extends Monster {

    public WaterMonster(String name) {

        this.monsterName = name;
    }

    @Override
    public String attack() {

        return "Attack with water!";
    }
}
