public class Pebble {
  private int posX;
  private int posY;
  private int size;

  public Pebble(int x, int y, int s) {
    posX = x;
    posY = y;
    size = s;
  }

  public void setPosition(int x, int y) {
    posX = x;
    posY = y;
  }

  public void setSize(int s) {
    size = s;
  }

  public int getX() {
    return posX;
  }

  public int getY() {
    return posY;
  }

  public int getSize() {
    return size;
  }

}
