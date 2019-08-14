int x = 200;
void setup() {
  size(800,500);
  background(250,0,0);
}

import ddf.minim.*;

void draw() {
  fill(#1E6F23);
  ellipse(x,100,10,10);
  if(mousePressed){
    x+=3;
  
    
    



  
  }
  if(x==800){
    playSound();
  }
  
}
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
