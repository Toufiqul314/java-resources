
public class Tester {

    public static void main(String[] args) {
        Player player = new Player();
        Player player1 = new Player();
        player.hit_four();
        player.hit_four();
        player1.hit_six();

        System.out.println("player run =" + player.run);
        System.out.println("player1 run =" + player1.run);
        System.out.println("player team run =" + ((player.teamRun) + (player1.teamRun)));
    }
}
