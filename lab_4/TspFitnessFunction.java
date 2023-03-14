package lab3;

import org.uncommons.watchmaker.framework.FitnessEvaluator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TspFitnessFunction implements FitnessEvaluator<TspSolution> {
    private ArrayList <int[]> Solution_index = new ArrayList();
    public TspFitnessFunction(String problem) {

        //String  a = problem;
        String path = "S:\\andrey\\мага\\sem_2\\evolv\\evolushion_2023\\lab_4\\" + problem;
        //path = path + "\\" + problem;
        //File file = new File(path);
        //Scanner sc = new Scanner(file);
        try {
            File f = new File (path);
            System.out.println(f.exists());
            Scanner sc = new Scanner(f);
            int flag = 0;
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                if("NODE_COORD_SECTION".equals(line)) {
                    flag = 1;
                    line = sc.nextLine();
                }
                if (flag == 1)
                {
                    if ("EOF".equals(line))
                        continue;
                    String[] strArray = line.split(" ");
                    int[] intArray = new int[strArray.length];
                    for(int i = 0; i < strArray.length; i++)
                    {
                        intArray[i] = Integer.parseInt(strArray[i]);
                    }
                    //System.out.println(Arrays.toString(intArray));
                    Solution_index.add(intArray);
                }
            }
        }
        //catch the exception
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public double getFitness(TspSolution solution, List<? extends TspSolution> list) {
        //System.out.println(solution.Solution);
        int start_x = Solution_index.get(solution.Solution.get(0))[1];
        int start_y = Solution_index.get(solution.Solution.get(0))[2];
        int curr_x, curr_y, last_x = start_x, last_y = start_y;
        double dist = 0;
        //System.out.println("hbdfhdf");
        for (int ind = 0; ind < solution.Solution.size(); ind++)
        {

            curr_x = Solution_index.get(solution.Solution.get(ind))[1];
            curr_y = Solution_index.get(solution.Solution.get(ind))[2];
            dist = dist + Math.sqrt(Math.pow((curr_y - last_y), 2) + Math.pow((curr_x - last_x), 2));

            last_x = curr_x;
            last_y = curr_y;
        }
        curr_x = start_x;
        curr_y = start_y;
        dist = dist + Math.sqrt(Math.pow((curr_y - last_y), 2) + Math.pow((curr_x - last_x), 2));
        //System.out.println(solution.Solution);
        //System.out.println(dist);
        return dist;
    }

    public boolean isNatural() {
        return false;
    }
}
