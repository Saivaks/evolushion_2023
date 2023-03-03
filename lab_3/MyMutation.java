package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        double a = 0.5;
        double len_pop = 1./population.size(); // 0.01
        double len_par = 1./population.get(0).length; // 0.2
        double shift = 0.00005;
        //System.out.println(len_par);
        for (int parent = 0; parent < population.size(); parent++) {
            for (int ind = 0; ind < population.get(parent).length; ind++) {
                while (true) {
                    double number = population.get(parent)[ind];
                    if ((random.nextDouble()>=len_pop + shift) || (random.nextDouble()>=len_par + shift))
                        break;
                    if (random.nextDouble()>1)
                    {
                        //number = a * random.nextGaussian() + population.get(parent)[ind];
                        number = a * random.nextDouble() + population.get(parent)[ind];
                    }
                    else{
                        number = 10 * random.nextDouble() - 5 ;
                    }
                    if ((number >= -5) || (number <= 5)) {
                        population.get(parent)[ind] = number;
                        break;
                    }
                }
            }
        }
        return population;
    }
}
