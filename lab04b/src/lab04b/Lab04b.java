package lab04b;

import java.awt.*;
import java.applet.*;

public class Lab04b extends Applet {

public void paint(Graphics g) {
// DRAW CUBE

g.drawRect(300, 400, 100, 100);
g.drawRect(330, 430, 100, 100);
g.drawLine(300, 400, 330, 430);
g.drawLine(400, 400, 430, 430);
g.drawLine(330, 530, 300, 500);
g.drawLine(430, 530, 400, 500);

// DRAW SPHERE

g.drawOval(600, 400, 200, 200);
g.drawOval(600, 430, 200, 150);
g.drawOval(600, 450, 200, 110);
g.drawOval(600, 480, 200, 50);
g.drawOval(650, 400, 100, 200);
g.drawOval(675, 400, 50, 200);
g.drawOval(690, 400, 15, 200);

// DRAW INSCRIBED/CIRCUMSIZED TRIANGLE

g.drawOval(700, 200, 200, 200);
g.drawOval(730, 270, 110, 85);
g.drawLine(700, 300, 800, 400);
g.drawLine(700, 300, 885, 240);
g.drawLine(800, 400, 885, 240);

// DRAW APCS
g.fillRect(300, 600, 35, 140);
g.fillRect(300, 600, 100, 35);
g.fillRect(400, 600, 35, 140);
g.fillRect(300, 670, 100, 35);

g.fillRect(450, 600, 35, 140);
g.fillRect(450, 600, 100, 35);
g.fillRect(550, 600, 35, 80);
g.fillRect(450, 670, 135, 35);

g.fillRect(600, 600, 35, 140);
g.fillRect(600, 600, 100, 35);
g.fillRect(600, 700, 100, 40);

g.fillRect(710, 600, 35, 70);
g.fillRect(710, 600, 80, 35);
g.fillRect(710, 670, 80, 35);
g.fillRect(770, 670, 25, 60);
g.fillRect(770, 700, 25, 35);
g.fillRect(710, 720, 85, 30);

}
}