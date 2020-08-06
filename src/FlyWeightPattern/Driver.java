package FlyWeightPattern;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        List<List<Integer>> treesInformation = new ArrayList<>();
        List<Integer> treeInformation = new ArrayList<>();

        for(int i=0; i<3000; i++){
            if(treeInformation.size()>2){
                treesInformation.add(treeInformation);
                treeInformation = new ArrayList<>();
                treeInformation.add(i);
            }else {
                treeInformation.add(i);
            }
        }
//      All 1000 tree info from some source
        TreeManager treeManager = new TreeManager();
        treeManager.displayTrees(treesInformation);
    }
}
