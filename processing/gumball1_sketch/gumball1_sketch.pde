/*class Button to create buttons*/
class Button
{
  private int xpos;
  private int ypos;
  private int breadth;
  private int len;
  private String text;
  
  public Button(int x, int y, int b, int l, String t)
  {
    xpos = x;
    ypos = y;
    breadth = b;
    len = l;
    text = t;
  }
  /*Check if mouse is urrently over the specified x and y positions*/
  public boolean isMouseOver()
  {
    if(mouseX >= xpos && mouseX<= xpos+breadth && mouseY >= ypos && mouseY <= ypos+len){
      return true;
    }
    else{
      return false;
    }
  }
  /*This function draws two rectangular buttons and fills text in them*/
  public void drawButton()
  {
    fill(255);
    rect(xpos, ypos, breadth, len); 
    fill(0);
    textSize(32);
    text(text, xpos, ypos+50);
  }
  /*Changes the color of the button according to the mouse events.*/
  public void changeButton(color c)
  {
    fill(c);
    rect(xpos,ypos,breadth,len);
    fill(0);
    textSize(32);
    text(text, xpos, ypos+50);
  }
}
Button b1,b2;
GumballMachine g = new GumballMachine(5);

void setup() 
{
  size(800, 800) ;
  background(255) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  
  // load font
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 32);

  b1 = new Button(50,600,200,100,"Insert Quarter");
  b2 = new Button(550,600,200,100,"Turn Crank");
  System.out.println(g.toString());
 // Only draw once
 
  //noLoop();
}

void draw() {

  fill(0);  
  text("The Gumball Machine", 250, 60);
  PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2);  
  
  b1.drawButton();
  b2.drawButton();

 if(b1.isMouseOver()){
     b1.changeButton(102);
  }
  if(b2.isMouseOver()){
    b2.changeButton(102);
  }
  //runTest() ;
}
  
 /*Checks for mouse click and calls the appropriate function depending on the button mouse is clicked in*/
void mouseClicked()
{
  if(b1.isMouseOver()){
     b1.changeButton(0);
     System.out.println(g.toString());
     g.insertQuarter();
   }
 
  
  if(b2.isMouseOver()){
    b2.changeButton(0);
    g.turnCrank();
  }
}
  


/*public void runTest() {
  GumballMachine gumballMachine = new GumballMachine(5);
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  
}*/