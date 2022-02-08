import java.util.LinkedList;

public abstract class MemoryPool<T> {

    private final LinkedList<T> pool = new LinkedList<>();
    private int poolSize;

    public MemoryPool(int poolSize) {
        this.poolSize = poolSize;
        for (int i = 0; i < poolSize; i++){
            pool.add(allocate());
        }
    }

    // this method returns a new object of class T
    public abstract T allocate();

    public T getFromPool() {
        T item = null;
        if (pool.size() == 0) {
            item = allocate();
        } else {
            item = pool.removeFirst();
        }
        return item;
    }

    public void returnToPool(T item) {
        if (pool.size() == poolSize) {
            pool.removeFirst();
        }

        pool.addLast(item);
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }
}
