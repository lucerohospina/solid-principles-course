public class SquareUI {
  boolean highResolutionMonitor = false;

  public void draw() {
    if(highResolutionMonitor) {
      // render a high resolution image of a square
    } else  {
      // render a normal image of a square
    }
  }

  public void rotate(int degree) {
    // rotate the image if the square clockwise to
    // the require degree and re-render
  }
}

// Responsibility: Rendering images of squares