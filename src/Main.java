public class Main {

    public static void main(String[] args) {
        Token token1 = new Token(5,20);
        Token token2 = new Token(6,20);
        Token token3 = new Token(7,20);
        Token token4 = new Token(8,20);
        Board board = new Board(4,token1,token2,token3,token4);
        Player player1 = new Player("Ana");
        Player player2 = new Player("Darius");
        Player player3 = new Player("Carla");
    }
}
