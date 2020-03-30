PImage rainbow;
PImage unicorn;

void setup() {
  rainbow = loadImage("rainbow.png");
size(800, 600);
rainbow.resize(width,height);
}

void draw() {
  background(rainbow); 
}
