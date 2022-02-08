public class Gun {
    private int totalShots;
    private BulletPool bulletPool;

    public Gun(BulletPool bulletPool, int totalShots) {
        this.bulletPool = bulletPool;
        this.totalShots = totalShots;
    }

    public void fireFromPool(){
        for(int i = 0; i < totalShots; i++){
            Bullet bullet = bulletPool.getFromPool();

            //Fire!!
            System.out.println("Shooting bullet #" + bullet.getBulletID());

            bulletPool.returnToPool(bullet);
        }
    }

    public void fire(){
        for(int i = 0; i < totalShots; i++) {
            Bullet bullet = new Bullet();

            //Fire!!
            System.out.println("Shooting bullet #" + bullet.getBulletID());
        }
    }

}
