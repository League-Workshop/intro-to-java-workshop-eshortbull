void setup() { 
  
size  (500, 500);
  
 PImage baby = loadImage ("raw.png");
 
 baby.resize(500,500);
 
 background (baby);
 text("Tested my program", 25, 50 );
 textSize(24);
}
void draw() {
(mousePressed) {
text  ("IT worked my fist time", 25, 450);
}
