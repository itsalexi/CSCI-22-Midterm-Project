public class GameConfig {
  private double acceleration;
  private int score;

  public GameConfig() {
    acceleration = 0.01;
    score = 1;
  }

  public void setScore(int s) {
    score = s;
  }

  public int getScore() {
    return score;
  }

  public void setAcceleration(double a) {
    acceleration = a;
  }

  public double getAcceleration() {
    return acceleration;
  }
}
