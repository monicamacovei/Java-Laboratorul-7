public class Player implements Runnable{
    String name;

    public Player(String name) {
        this.name = name;
    }
    public void run(Board board) {
        board.removeToken();
    }
}
