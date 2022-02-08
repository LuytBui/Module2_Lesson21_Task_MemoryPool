public class Main {
    public static int bulletPoolSize = 10;
    public static int totalShots = 1000;

    public static void main(String[] args) {

        BulletPool bulletPool = new BulletPool(bulletPoolSize);
	    Gun gun = new Gun(bulletPool, totalShots);

        gun.fireFromPool();
        System.out.println("Total bullet created: " + Bullet.count);

//        gun.fire();
//        System.out.println("Total bullet created: " + Bullet.count);
    }
}
