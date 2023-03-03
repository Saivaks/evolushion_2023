package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();
        double[] children_1 = new double[p1.length];
        double[] children_2 = new double[p2.length];
        // your implementation:
        for (int ind = 0; ind < p1.length; ind++)
        {
            if (ind < i)
            {
                children_1[ind] = p1[ind];
                children_2[ind] = p2[ind];
            }
            else
            {
                //double a = random.nextDouble();
                double a = 0.5;
                children_1[ind] = a*p1[ind] + (1-a)*p2[ind];
                //a = random.nextDouble();
                children_2[ind] = a*p2[ind] + (1-a)*p1[ind];
            }
        }
        children.add(children_1);
        children.add(children_2);
        return children;
    }
}
