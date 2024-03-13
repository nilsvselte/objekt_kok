package oving7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class ObservableHighscoreList extends ObservableList {
    private int maxScores;
    private List<Integer> Scores = new ArrayList<>();

    public static void main(String[] args) {
        // ObservableHighscoreList Bers = new ObservableHighscoreList(5);
        // Bers.addResult(7);
        // Bers.addResult(1231);
        // Bers.addResult(121);
        // Bers.addResult(5);
        // Bers.addResult(6);
        // Bers.addResult(1);
        
        // System.out.println(Bers.toString());

        
    }
    // Constructor
    public ObservableHighscoreList(int maxMembers) {
        this.maxScores = maxMembers;

    }
    @Override
    public String toString(){
        String retStr = "";
        for(int i: Scores){
         retStr+= i +" , ";
        }
        return retStr;
    }

    public int size() {
        return Scores.size();
    }

    public int getElement(int index) {
        return Scores.get(index);
    }

    public void addResult(int result) {
        Scores.add(result);
        sortScores();
        int changedIndex = Scores.indexOf(result);
        
        int noOfMatches = Scores.stream().mapToInt(( scr) -> {
            return (scr==result) ? 1 : 0;
        }).sum()-1;

        if(Scores.size()>maxScores){
            Scores.remove(maxScores);
        }
        if(changedIndex<maxScores){
            notifyListeners(changedIndex+noOfMatches);
        } else{
            notifyListeners(-1);
        }
    }
    //Private methods
    private void sortScores(){
        Scores.sort((a,b) -> a-b);
    }
}
