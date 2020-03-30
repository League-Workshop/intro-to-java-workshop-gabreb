

void setup() { 
  size(400, 400); 
}

void draw() {
ellipse(200, 200, 350, 350);
if (mousePressed) {
     fill(300, 200, 100); 
} else {
     fill(100, 200, 300); 
}
}
