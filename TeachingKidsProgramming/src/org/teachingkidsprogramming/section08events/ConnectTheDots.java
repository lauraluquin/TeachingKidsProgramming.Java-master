package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    Tortoise.show();
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    Tortoise.setSpeed(10);
    clearTheScreen();
    prepareColorPalette();
  }
  private void clearTheScreen()
  {
    Tortoise.clear();
    new Text("Right click to clear").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Greens.Green);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Pinks.Pink);
    ColorWheel.addColor(PenColors.Blues.Teal);
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    addDot(x, y);
  }
  private void addDot(int x, int y)
  {
    addACircle(x, y);
  }
  private void addACircle(int x, int y)
  {
    Circle c = new Circle(7, ColorWheel.getNextColor());
    c.setTransparency(60);
    Tortoise.moveTo(x, y);
    c.addTo(Tortoise.getBackgroundWindow());
  }
}
