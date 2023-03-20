import java.util.*;

import static java.lang.Thread.sleep;

public class Hippodrome {
    public Horse getWinner() {
        Horse winner = Collections.max(horses, new Comparator<Horse>() {
            @Override
            public int compare(Horse arg0, Horse arg1) {
                return Integer.compare((int) arg0.getDistance(), (int) arg1.getDistance());
            }
        });
        return winner;
    }                   // get winer ---> horse.distatnce > horse.distance ?  winer

    public void printWinner() {
        System.out.println("The winner is " + getWinner() + "!");
    }       // only print winner

    Hippodrome(List horses) {                                       //construction
        this.horses = horses;
    }

    public static Hippodrome game;
    private List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            sleep(200);
        }
        printWinner();

    }

    public void move() {
        for (Horse horse : horses)
            horse.move();
    }

    public void print() {
        for (Horse horse : horses)
            horse.print();
        System.out.println("\n\n\n\n\n\n");
    }


    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        List<Horse> horses = new ArrayList<>();
        String moreTabs = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";


        System.out.println(moreTabs + "It's Horse Racing!!!!");
        System.out.println("First write, how much horses can be (3 or 5)");
        String how = scan.nextLine();
        System.out.println("Ok! Good " + how + " horses");


        System.out.println("Lets give them a name!" + "\n Write " + how + " names");                // name horses
        for (int i = 1; i <= Integer.parseInt(how); i++) {
            String varable = scan.nextLine();
            horses.add(new Horse(varable, i));
        }

        for (Horse horse : horses)                                                                  // sout horses
            System.out.println(moreTabs + "     " + horse.number + " " + horse.name);


        for (int i = 10; i > 0; i--) {                                                              //timer
            System.out.println(moreTabs + "Start in " + i + "sec");
            sleep(1000);
        }
        System.out.println(moreTabs + "   Start!!!!");
        game = new Hippodrome(horses);
        game.run();                                                                                   //start this game

    }
}
