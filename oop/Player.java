
public class Player {

    public int run = 0;//instance variable
    public int teamRun = 0;

    public void hit_four() {
        run += 4;
        teamRun += 4;
    }

    public void hit_six() {
        run += 6;
        teamRun += 6;
    }
}
