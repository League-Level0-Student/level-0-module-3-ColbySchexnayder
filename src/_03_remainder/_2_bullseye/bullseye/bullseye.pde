
void setup() {

  // set the size of your sketch
  size(500, 500);
}

void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

  //Use an if statement and remainder to alternate the color of your rings.

  for (int i = 0; i < 8; i++) {

    println(i + " " + i % 2);
    if (i % 2 == 0) {
      fill(0, 0, 0);
    } else {
      fill(255, 0, 0);
    }

    ellipse(250, 250, 300 - i * 40, 300 - i * 40);
  }
}
