
package gopher;
import java.util.Random;

public class randomNumber {
    public static Integer getRandomNumber(Integer end,Integer start){
        Integer randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(end-start);
        return (randomNumber+1000);
        
    }
}
