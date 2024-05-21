public class Scoreboard {
  private int team1; private int team2;
  private String name1; private String name2;
  private boolean active;

  public Scoreboard (String n1, String n2) {
    name1=n1; name2=n2;
    team1=0;team2=0;
    active=true;
  }

  public void recordPlay(int val){
    if (val==0){
      active=!active;
    }
    else{
      if (active){
        team1+=val;
      }
      else {
        team2+=val;
      }
    }
  }

  public String getScore(){
    if (active){
      return team1+"-"+team2+"-"+name1;
    }
    else{
      return team1+"-"+team2+"-"+name2;
    }
  }
  
}
