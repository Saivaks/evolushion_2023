package lab3;

import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;
import java.io.File;
import java.util.*;
import java.io.*;
import java.util.Scanner;
public class TspFactory extends AbstractCandidateFactory<TspSolution> {

    int size = 0;
    public TspFactory(int problem) {
        size = problem;
    }

    public TspSolution generateRandomCandidate(Random random) {
        TspSolution solution = new TspSolution();

        for (int ind = 0; ind<size;ind++)
        {
            solution.Solution.add(ind);
        }
        //your implementation
        return solution;
    }
}

