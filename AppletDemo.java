import java.applet.*;
import java.awt.*;
/*<applet code="AppletDemo.class" width="300" height="300">
</applet>*/
public class AppletDemo extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello World",100,150);
g.drawLine(150,300,250,200);
g.drawLine(175,300,170,500);
g.drawRect(150,300,250,200);
g.drawRect(300,359,200,200);
}
}
