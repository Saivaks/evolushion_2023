package lab3;

import org.uncommons.watchmaker.framework.FitnessEvaluator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TspFitnessFunction implements FitnessEvaluator<TspSolution> {
    public TspFitnessFunction() {
    }

    public double getFitness(TspSolution solution, List<? extends TspSolution> list) {
        //System.out.println(solution.Solution);
        int exept = 0;
        int y1 = 0;
        int y2 = 0;
        for (int ind_i=0;ind_i<solution.Solution.size() - 1; ind_i++)
        {
            for (int ind_j=ind_i + 1;ind_j<solution.Solution.size(); ind_j++)
            {
                y1 = solution.Solution.get(ind_i);
                y2 = solution.Solution.get(ind_j);
                if (ind_j - ind_i == Math.abs(y2 - y1))
                    exept = exept + 1;
            }
        }
        //System.out.println(exept);
        //if (exept == 8)
        //    System.out.println(solution.Solution);
        return exept;
    }

    public boolean isNatural() {
        return false;
    }
}
