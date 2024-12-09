public class FireMonster extends Monster {

    public FireMonster(String name) {

        this.monsterName = name;
    }

    @Override
    public String attack() {

        return "Attack with fire!";
    }
}
