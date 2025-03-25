package ejPlayable;

public class Main {
    public static void main(String[] args) {
        Playable[] playables = {new Football(), new Volleyball(), new Basketball()};

        for (Playable playable : playables) {
            playable.play();
        }
    }

}
