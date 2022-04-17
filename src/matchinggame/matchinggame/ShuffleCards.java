
package matchinggame;
import java.util.LinkedList;
import java.util.Random;
public class ShuffleCards {
    public void shuffleCards(Letter[][] cards) {
        LinkedList<Letter> randomNum = new LinkedList<Letter>();
        Random r = new Random(); 
        int randomIndex = 0; 
        

        randomNum.add(Letter.A);
        randomNum.add(Letter.B);
        randomNum.add(Letter.C);
        randomNum.add(Letter.D);
        randomNum.add(Letter.E);
        randomNum.add(Letter.F);
        randomNum.add(Letter.G);
        randomNum.add(Letter.H);
        randomNum.add(Letter.A);
        randomNum.add(Letter.B);
        randomNum.add(Letter.C);
        randomNum.add(Letter.D);
        randomNum.add(Letter.E);
        randomNum.add(Letter.F);
        randomNum.add(Letter.G);
        randomNum.add(Letter.H);

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                randomIndex = r.nextInt(randomNum.size()); 
                cards[i][j] = randomNum.get(randomIndex); 
                randomNum.remove(randomIndex); 
            }
        }
    }
}
