import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for (int i=1;i<wordList.size();i++){
      if (wordList.get(i).indexOf(wordList.get(i-1))==-1){
        return false;
      }
    }
    return true;
  }


  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
    for (String x: wordList){
      if (x.indexOf(target)==0){
        result.add(x.substring(target.length()));
      }
    }
    return result;             
  }
}
