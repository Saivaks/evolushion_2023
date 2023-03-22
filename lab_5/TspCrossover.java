package lab3;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TspCrossover extends AbstractCrossover<TspSolution> {
    protected TspCrossover() {
        super(1);
    }

    protected List<TspSolution> mate(TspSolution p1, TspSolution p2, int i, Random random) {
        ArrayList <TspSolution> children = new ArrayList <TspSolution> ();
        //double[] children_1 = new double[p1.length];
        //double[] children_2 = new double[p2.length];
        TspSolution children_1 = new TspSolution();
        TspSolution children_2 = new TspSolution();
        for (int ind_j = 0; ind_j < p1.Solution.size(); ind_j++)
        {
            children_1.Solution.add(p2.Solution.get(ind_j));
            children_2.Solution.add(p1.Solution.get(ind_j));
        }
        //children_1.Solution = p2.Solution;
        //children_2.Solution = p1.Solution;
        //List <Integer> children_2 = p2.Solution;
        i = 15;
        int max_len = p1.Solution.size() - i - 1;
        //System.out.println(p1.Solution.size());
        //System.out.println(p1.Solution);
        int a = random.nextInt((max_len) + 1);
        int b = a + i;
        //System.out.println(i);
        //System.out.println(b);
        for (int ind = a; ind <= b; ind++)
        {
            children_1.set(ind, p1.Solution.get(ind));
            children_2.set(ind, p2.Solution.get(ind));
            //children_2.get(ind) = p2.Solution.get(ind);
            for (int ind_j = 0; ind_j < p1.Solution.size(); ind_j++)
            {
                if (children_1.Solution.get(ind).equals(children_1.Solution.get(ind_j)))
                {

                    children_1.set(ind_j, p2.Solution.get(ind_j));
                }
                if (children_2.Solution.get(ind).equals(children_2.Solution.get(ind_j)))
                {
                    children_2.set(ind_j, p1.Solution.get(ind_j));
                }
            }
        }

        children.add(children_1);
        children.add(children_2);
        // your implementation:
        return children;
    }
}
