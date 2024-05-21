public class Feeder{
  private int currentFood;

  public Feeder(int f){
    currentFood=f;
  }
  public void simulateOneDay(int numBirds){
    if ((int)((Math.random()*20)+1)==20){
      currentFood=0;
    }
    else{
      int gram=(int)((Math.random()*41)+10);
      if (gram*numBirds>currentFood){
        currentFood=0;
      }
      else{
        currentFood-=gram*numBirds;
      }
    }
  }
  
  public int simulateManyDays(int numBirds, int numDays){
    int count=0;
    while(currentFood>0 && count<numDays){
      simulateOneDay(numBirds);
      count++;
    }
    return count;
  }
}
