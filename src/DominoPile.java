import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return (pile);
    }

    public void newStack6() {
        int a = 0;
        int b = 0;
        for (int i = 0; i <= 6; i++) {
            for (a = b; a < 6; a++) {
                pile.add(new Domino(i, a));
            }
            b++;
            pile.add(new Domino(i, a));
        }
    }
    public void shuffle() {
        ArrayList<Domino> x = new ArrayList<>();

        for (int i = pile.size(); i > 0; i--) {
            int min = 0;
            int range = i - min + 1;
            int rand = (int) (Math.random() * range) + min;

            x.add(pile.get(rand));
        }
        pile = x;
    }
}