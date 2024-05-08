package metodologie;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AppTest {
    @Test
    public void invert1() {
        Invert<Integer> inverter = App.inverter();
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals((List<Integer>) Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), inverter.invert(elements));
    }

    @Test
    public void invert2() {
        Invert<Integer> inverter = App.inverter();
        List<Integer> elements = Arrays.asList(29, 901, 99, 809, 910);
        assertEquals((List<Integer>) Arrays.asList(910, 809, 99, 901, 29), inverter.invert(elements));
    }

    @Test
    public void invert3() {
        Invert<Integer> inverter = App.inverter();
        List<Integer> elements = Arrays.asList(29, 901, 99, 809, 910);
        assertEquals((List<Integer>) Arrays.asList(910, 809, 99, 901, 29), inverter.invert(elements));
    }

    @Test
    public void max1() {
        Max<Integer> maximizer = App.maximizer();
        List<Integer> elements = Arrays.asList(29, 901, 99, 809, 910);
        Integer max = 910;
        assertEquals(max, maximizer.max(elements));
    }

    class Potato implements Comparable<Potato> {
        public final Double weightKg;

        public Potato(double weightKg) {
            this.weightKg = weightKg;
        }

        @Override
        public int compareTo(Potato potato) {
            return this.weightKg.compareTo(potato.weightKg);
        }

        @Override
        public boolean equals(Object obj) {
            Potato potato = (Potato) obj;
            return this.weightKg == potato.weightKg;
        }
    }

    @Test
    public void max2() {
        Max<Potato> maximizer = App.maximizer();
        List<Potato> elements = Arrays.asList(new Potato(1.2), new Potato(0.6), new Potato(0.1), new Potato(2.2),
                new Potato(3.5));
        assertEquals((Double) 3.5, (Double) maximizer.max(elements).weightKg);
    }

    class RichGuy implements Comparable<RichGuy> {
        public final Integer numberOfCars;

        public RichGuy(int numberOfCars) {
            this.numberOfCars = numberOfCars;
        }

        @Override
        public int compareTo(RichGuy potato) {
            return this.numberOfCars.compareTo(potato.numberOfCars);
        }

        @Override
        public boolean equals(Object obj) {
            RichGuy potato = (RichGuy) obj;
            return this.numberOfCars == potato.numberOfCars;
        }
    }

    @Test
    public void max3() {
        Max<RichGuy> maximizer = App.maximizer();
        List<RichGuy> elements = Arrays.asList(new RichGuy(1), new RichGuy(10), new RichGuy(4), new RichGuy(3),
                new RichGuy(22));
        assertEquals((Integer) 22, (Integer) maximizer.max(elements).numberOfCars);
    }
}
