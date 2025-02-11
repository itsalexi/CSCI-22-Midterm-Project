public class Player extends Square {
  public static final double GRAVITY = 0.3;

  protected double speedX = 0;
  protected double speedY = 0;

  public Player(double x, double y, int s) {
    super(x, y, s);
  }

  public void move(double x, double y) {
    posX -= x;
    posY -= y;
  }

  public void update() {
    move(speedX, speedY);
    speedX *= 0.99;
    speedY *= 0.99;
    accelerate(0, -GRAVITY);
  }

  public void accelerate(double accelerationX, double accelerationY) {
    speedX += accelerationX;
    speedY += accelerationY;
  }

  public void setSpeedX(double x) {
    speedX = x;
  }

  public void setSpeedY(double y) {
    speedY = y;
  }

}
