package FlyWeightPattern;

import java.util.List;

public class TreeManager {

    public void displayTrees(List<List<Integer>> trees){
        RenderTree renderTree = new RenderTree();
        for(List<Integer> tree : trees){
            renderTree.displayTree(tree.get(0), tree.get(1), tree.get(2));
        }
    }
}
