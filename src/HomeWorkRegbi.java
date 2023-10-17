import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.Random;

public class HomeWorkRegbi {
    public static void main(String[] args) {
        Random random = new Random();
        String team01 = "Team01";
        System.out.println(team01);

        int[] t1array = new int[25];

        for (int index = 0; index < t1array.length; index++) {
            t1array[index] = random.nextInt(22) + 18;
            System.out.print(t1array[index] + ", ");}


            int sum01 = 0;
            for (int x : t1array
            ) {
                sum01 += x;
            }
            double avg01 = (double) sum01 / t1array.length;
            System.out.println(" Середній вік Team01  = " + avg01);


            String team02 = "Team02";

            System.out.println(team02);

            int[] t2array = new int[25];
            for (int index = 0; index < t2array.length; index++) {
                t2array[index] = random.nextInt(22) + 18;
                System.out.print(t2array[index] + ", ");
            }


        int sum02 = 0;
        for (int x : t2array
        ) {
            sum02 += x;
        }
        double avg02 = (double) sum02 / t2array.length;
        System.out.println(" Середній вік Team02  = " + avg02);


    }

    }


