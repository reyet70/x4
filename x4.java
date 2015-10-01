//// Excercise 4: Click button to change background

int r,g,b;
float button1X=200, button1Y=200, button1W=80, button1H=50;
int counter=25;

//// SETUP: size only. Also set colors.
void setup () {
  size (720, 560);
  reset();
}
void reset() {
  r=234;
  g=78;
  b=172;
}

//// NEXT: button only.
void draw () {
  background (r,g,b);
showButton( button1X, button1Y, button1W, button1H );
  fill (200,200,0);
  rect (x,y,w,h);
  text( "Click me!", buttin1X=button1W/6, button1Y=button1H*3/4);
}
//// HANDLERS: keys & click
void keypressed() {
  if (key== 'q') exit();
  if (key== 'r') reset();
}
void mousePressed() {
  if (hit (mouseX, mouseY, 75,75,25,25) ) {
    counter= counter+6;
    if (counter % 3 > 0) {
      r=0;
      g=211;
      b=160;
    } else  {
      reset();
    }
  }
}
//// detect hit
// Return true if "near"
boolean hit (float x1, float y1, float xt, float y2, float w, float h){
  boolean result;
if ( abs(x2-x1) < w && abs(y1-y2)<h ) {
    result=  true;
  } else {
    result=false;
  }

  return result;
}
      
