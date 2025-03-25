import java.applet.*;
import java.awt.*;
/*<applet code="AppletDemo1.class" width="300" height="300">
</applet>*/
public class AppletDemo1 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.GRAY);
g.drawRect(200,400,250,300);
g.drawRoundRect(300,350,200,200,23,34);
g.fillRoundRect(300,350,200,200,23,34);
g.setColor(Color.RED);
int x[]={200,300,300,200,100,100};
int y[]={0,100,500,700,500,100};
g.fillPolygon(x,y,6);
g.setColor(Color.BLACK);
g.drawArc(100,120,130,140,150,160);
g.fillArc(100,120,130,140,150,160);
g.setFont(FONT.ITALIC);
g.drawString("AI/ML")
}
}

