package gopher;

import static gopher.randomNumber.getRandomNumber;

public class Lottery {
    private Integer lotteryNumber;
    
    public Lottery(){
       this.lotteryNumber=getRandomNumber(400,100);
    }
    
    public Integer getLotteryNumber() {
        return this.lotteryNumber;
    }
    
    public void setLotteryNumber(Integer lotteryNumber) {
        this.lotteryNumber =lotteryNumber;
    }
}
