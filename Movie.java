/*
 * Activity 2.2.9
 */
public class Movie
{
  private String title;
  private double duration;

  public Movie(String title, double duration)
  {
    this.title = title;
    this.duration = duration;
  }

  public String toString()
  {
    return "\"" + title + "\", duration " + duration + " hours";
  }
}
