 PImage loaf_of_doge;
int acceleration=5;
int x1=165;
  int y1=840;
 int x=1465;
 int y=772;
 void setup(){
size( 2000, 1800);
loaf_of_doge=loadImage("doge.jpg");
    loaf_of_doge.resize(width, height);
background(loaf_of_doge);

 }




 void draw(){
      if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
noStroke();
   fill( 77,183,185);
ellipse(x,y,50,50);
 fill( 185,77,104);
ellipse(x+300,y-20,50,50);
   fill(#05ECFF);
             ellipse(x1,y1,50,50);     
fill(#97B0B2);
rect(557,210,100,150);
fill(#61F1FC);
rect(581,238,50,50);
fill(#97B0B2);
rect(1102,268,100,150);
fill(#61F1FC);
rect(1126,304,50,50);
 if(keyPressed){keyPressed();}
 }
     void keyPressed() {
                 x-=2*acceleration;
      y-=2*acceleration;
 x1+=2*acceleration;
      y1-=2*acceleration;
}
 
