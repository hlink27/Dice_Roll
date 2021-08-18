package rpg_stats;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
public class Dados {
    
    public ArrayList<Integer> hist = new ArrayList<Integer>();

    public void setHist(ArrayList<Integer> a) {
        this.hist = a;
    }
    
    public int roll(int lados, int quantidade){
        int min = 1;
        int max = lados;
        int total = 0;
        
        ArrayList<Integer> hist = new ArrayList<Integer>();
        
        for(int i = 0; i < quantidade; i++){
            int rolagem = (int)(Math.random()*(max-min+1)+min);
            total = total + rolagem;
            hist.add(rolagem);
            this.hist = hist;
        }
        return total;
    }
}
