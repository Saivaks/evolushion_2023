package lab3;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class TspMutation implements EvolutionaryOperator<TspSolution> {
    public List<TspSolution> apply(List <TspSolution> population, Random random) {

        double len_pop = 1./population.size();
        //System.out.println(len_pop);
        double len_par = 1./population.get(0).Solution.size();

        int rangeMin = 0;
        int rangeMax = population.get(0).Solution.size();
        for (int parent = 0; parent < population.size(); parent++) {

            if (random.nextDouble()>len_pop)
                continue;

            //TspSolution temp = population.get(parent);
            for (int ind = 0; ind < rangeMax; ind++) {
                if (random.nextDouble()>len_par)
                    continue;

                //double[] temp_ind = new double[population.get(parent).length];
                int ind_temp = 0;
                while (true)
                {
                    ind_temp = random.nextInt((rangeMax - rangeMin)) + rangeMin;
                    if (ind_temp != ind)
                        break;
                }
                int temp_obj = population.get(parent).Solution.get(ind);
                population.get(parent).Solution.set(ind, population.get(parent).Solution.get(ind_temp));
                population.get(parent).Solution.set(ind_temp, temp_obj);
            }
            //System.out.println(population.get(parent).Solution);
            //population.get(parent) = temp;
        }
        // your implementation:
        return population;
    }
}
