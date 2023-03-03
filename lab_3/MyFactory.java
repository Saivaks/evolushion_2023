package lab2;

import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class MyFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public MyFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        int rangeMin = -5;
        int rangeMax = 5;
        for (int ind = 0; ind < dimension; ind++)
        {
            solution[ind] = rangeMin + (rangeMax - rangeMin) * random.nextDouble();

        }
        // x from -5.0 to 5.0

        // your implementation:

        return solution;
    }
}

