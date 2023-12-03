// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lab05.Hee_Haw();
    }
    class Lab05{
        public static void Hee_Haw(){
            Warrior leonidas  = new Warrior("leonidas",10,10,5,10);
            Wizard merlin = new Wizard("merlin",10,5,10,8);
            Rings ring = new Rings("The_Lord_Of_The_Ring",20);
            Necklaces necklaces = new Necklaces("Necklace_Of_MUSPELHEIM",20);

            merlin.showstate();
            merlin.skill_Fireball(leonidas);
            leonidas.showstate();
            merlin.skill_Debuff(leonidas);
            leonidas.showstate();
            merlin.showstate();
            leonidas.skill_Buffatk();
            leonidas.showstate();
            leonidas.skill_Buffatk();
            leonidas.showstate();
            merlin.attack(leonidas);
            leonidas.showstate();

            leonidas.equipAccessory(ring);
            leonidas.attack(merlin);
            merlin.showstate();
        }
    }
}