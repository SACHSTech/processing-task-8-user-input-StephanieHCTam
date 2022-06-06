import processing.core.PApplet;
import processing.core.PImage;

/**
 * A program with user input.
 * @author: Stephanie Tam
 */

public class Sketch extends PApplet {

  PImage imgRedHeart;
  PImage imgBlueHeart;
  PImage imgPurpleHeart;
  PImage imgGreenHeart;
  PImage imgSparkle;

  String message = "";

  int sunX = 100;
  int sunY = 150;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 210, 240);

    // load images

    imgRedHeart = loadImage("Hearts/redheart.png");
    imgRedHeart.resize(50, 50);

    imgBlueHeart = loadImage("Hearts/blueheart.png");
    imgBlueHeart.resize(50, 50);

    imgPurpleHeart = loadImage("Hearts/purpleheart.png");
    imgPurpleHeart.resize(50, 50);

    imgGreenHeart = loadImage("Hearts/greenheart.png");
    imgGreenHeart.resize(50, 50);

    imgSparkle = loadImage("Hearts/sparkles.png");
    imgSparkle.resize(50, 50);

    textSize(136);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // mousePressed Variable
    if (mousePressed) {
      // mouseX and mouseY Variables
      image(imgSparkle, mouseX, mouseY);
    }

    text(message, 25, 150);

    // keyPressed Variable
    if(keyPressed){
      image(imgPurpleHeart, mouseX, mouseY);
    }

    // keyPressed Variable
    // keyCode Variable
    if (keyPressed) {
      if (keyCode == UP) {
        sunY--;
      }
      else if (keyCode == DOWN) {
        sunY++;
      }
      else if (keyCode == LEFT){
        sunX--;
      }
      else if (keyCode == RIGHT){
       sunX++; 
      }
    }
    
    // Sun
    ellipse(sunX, sunY, 100, 100);

  }

  // keyTyped function
  // key variable
  public void keyTyped() {
    message += key;
  }
  
  // mouseClicked function
  public void mouseClicked() {
    image(imgRedHeart, mouseX, mouseY);
  }

  // mouseMoved function
  public void mouseMoved() {
    if (mouseX > 300){
      fill(random(255), random(255), random(255)); 
    }
    else {
      fill(244, 164, 245);
    }
    // mouseX and mouseY Variables
    ellipse(mouseX, mouseY, 30, 30); 
  }
  
  // mouseWheel function
  public void mouseWheel(){
    fill(252, 186, 3); 
    rect(mouseX , mouseY, 10, 50);
   
    fill(252, 186, 3);
    rect(mouseX - 10, mouseY - 10, 10, 50);
    }

  // mouseReleased function
  public void mouseReleased(){
    image(imgBlueHeart, random(0, 600), random(0, 400));
  }

  // keyReleased function
  public void keyReleased(){
    fill(0);
    text("HI!", 100, 100);
  }
  
  // define other methods down here.
}