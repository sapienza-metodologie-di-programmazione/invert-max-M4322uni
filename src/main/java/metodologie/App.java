package metodologie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
    }

    public static <T> Invert<T> inverter() {
        return list ->  {
			List<T> neu = new ArrayList<>(list);
			Collections.reverse(neu);
			return neu;
		};
    }

    public static <T extends Comparable<T>> Max<T> maximizer() {
        return Collections::max;
    }
}
