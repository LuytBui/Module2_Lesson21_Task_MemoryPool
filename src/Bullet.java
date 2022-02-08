public class Bullet {
    public static int count;

    private int bulletID;

    public Bullet() {
        bulletID = Bullet.count + 1;
        count++;
    }

    public int getBulletID() {
        return bulletID;
    }

}
