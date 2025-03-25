import java.applet.*;
import java.awt.*;
/*<applet code="AppletDemo.class" width="300" height="300">
</applet>*/
public class AppletDemo extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.PINK);
g.drawString("Hello World",100,150);
g.setColor(Color.YELLOW);
g.drawLine(150,300,250,200);
g.drawLine(175,350,170,500);
g.drawOval(200,400,100,150);
g.drawOval(300,350,200,200);
g.setColor(Color.BLACK);
g.fillOval(200,400,100,150);
g.setColor(Color.RED);
g.fillOval(300,350,200,200);
g.drawRect(200,400,250,300);
g.drawRoundRect(300,350,200,200,23,34);
g.fillRoundRect(300,350,200,200,23,34);
}
}
