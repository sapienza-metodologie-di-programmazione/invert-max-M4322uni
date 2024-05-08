package metodologie;

import java.util.List;

public interface Max<T extends Comparable<T>> {
    public T max(List<T> list);
}
