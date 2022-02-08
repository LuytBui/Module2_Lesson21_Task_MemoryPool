public class BulletPool extends MemoryPool<Bullet>{
    public BulletPool(int maxSize) {
        super(maxSize);
        super.setPoolSize(maxSize);
    }

    @Override
    public Bullet allocate() {
        return new Bullet();
    }
}
