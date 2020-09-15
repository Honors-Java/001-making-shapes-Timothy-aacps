// welcome! 😄🔥

void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //this rectangle is the start of your army tank
  //all of your programming should be after this 👍 
  //cannon top
  rect(100, 200, 100, 50);
  //body
  rect(150,275, 200, 100);
  //cannon
  rect(250, 200, 200, 15);


 //ellipses for wheels
  ellipse(50, 325, 50, 50);
  ellipse(100, 325, 50, 50);
  ellipse(150, 325, 50, 50);
  ellipse(200, 325, 50, 50);
  ellipse(250, 325, 50, 50);

  
 
	

}