// SINGLE RESPONSIBILITY PRINCIPLE
// every sofware component should have one and only one responsability (responsibility = REASON TO CHANGE)
// software component = java class. Could be moethod, function, module...

// COHESION
// is the degree to which the various parts of a software component are related
// We should aim to HIGH cohesion within a class
// Higher cohesion helps attain better adherence to the Single Reponsibility Principle

// COULPING
// is defined as the level of inter dependency between various software components
// aim for loose coupling

public class Square {
  int side = 5;

  public int calculateArea() {
    return side * side;
  }

  public int calculatePerimeter() {
    return side * 4;
  }

  // LET'S MOVE THESE TO ITS OWN CLASS
  // public void draw() {
  //   boolean highResolutionMonitor = false;

  //   if(highResolutionMonitor) {
  //     // render a high resolution image of a square
  //   } else  {
  //     // render a normal image of a square
  //   }
  // }

  // public void rotate(int degree) {
  //   // rotate the image if the square clockwise to
  //   // the require degree and re-render
  // }
}

// Responsibility: Measurements of squares
