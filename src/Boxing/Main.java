package Boxing;

public class Main {
    public static void main(String[]Args){
        Boxer b1 = new Boxer("First", 10,120,100,30);
        Boxer b2 = new Boxer("Second",20,85,85,40);

        Match match = new Match(b1,b2,85,100);
        match.run();

    }
}
