PImage mustache;
PImage friend;
void setup() {
friend = loadImage("logan.jpg");
size(800, 600);
friend.resize(width,height);
 mustache = loadImage("mustache.png");
mustache.resize(50, 50);
}

void draw() {
background(friend); 
  if (mousePressed) {
    image(mustache, mouseX-25, mouseY-25);
  }
}
