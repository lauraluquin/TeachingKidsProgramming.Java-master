package org.teachingkidsprogramming.section08events;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  private ProgramWindow programWindow;
  public SimpleBubble()
  {
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    //    prepareColorPalette (recipe below) --#7.1
    //
    //    ------------- Recipe for prepareColorPalette --#7.2
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    //    ------------- End of prepareColorPalette recipe --#7.3
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //     createBubble (recipe below) --#8.1
    //     ------------- Recipe for createBubble --#8.2
    //     Remove previous bubbles from your program window --#9
    Circle circle = new Circle(25, ColorWheel.getNextColor());
    circle.setCenter(10, 50);
    circle.addTo(programWindow);
    //    ------------- End of createBubble recipe --#8.3
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}