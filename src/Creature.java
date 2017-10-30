/**
 * Created by k1763653 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name){
        energy = fullness = happiness = 15;

        this.name = name;
    }

    public void eat(){
        if (fullness >= 12){
            print("Woops, " + this.getName() + " is already full");
        }
        else{
            fullness += 8;
            happiness -= 6;
            energy -=4;

            if (fullness > 15) {fullness = 15;}

            print("Yum, " + this.getName() + " really enjoyed that!");
        }
    }

    public void sleep(){
        if (energy >= 12){
            print("Woops, " + this.getName() + " is not that sleepy");
        }
        else{
            energy += 8;
            happiness -= 5;
            fullness -= 5;

            if (energy > 15) {energy = 15;}

            print("*yawn*, that was a good nap!");
        }
    }

    public void play() {
        happiness += 8;
        fullness -= 4;
        energy -= 6;

        if (fullness > 15) {fullness = 15;}

        print("This was so much fun! Let's do it again");
    }

    public String getName() {
        return name;
    }

    public String checkStatus() {
        String status = "";

        if (happiness <= 6){
            status += "Oh, " + this.getName() + "is feeling sad.\n";
        }

        if (energy <= 6){
            status += "Oh, " + this.getName() + "is really tired.\n";
        }

        if (fullness <= 6){
            status += "Oh, " + this.getName() + "is super hungry.\n";
        }

        return status;
    }

    public void print(String s){
        System.out.print(s);
    }
}
