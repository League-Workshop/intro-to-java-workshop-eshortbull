

void setup() {
 size (600,600); 
}

void draw() {
  ellipse(150,200,250,250);
  fill(#2C4BE3);
  if (mousePressed) {
    fill (#05FA03);
  } else { 
    fill (#FEFF0D);
  } 
}
