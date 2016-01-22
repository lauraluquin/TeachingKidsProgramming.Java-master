package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;
import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleBubbleQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleBubbleQuizGrader;

public class SimpleBubbleQuiz extends SimpleBubbleQuizAdapter
    implements
      MouseLeftClickListener,
      MouseRightClickListener
{
  @Override
  public void question1()
  {
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
  }
  @Override
  public void question2()
  {
    new Text("Single!").setPenColor(PenColors.Yellows.Yellow).setTopLeft(155, 135)
        .addTo(Tortoise.getBackgroundWindow());
  }
  @Override
  public void question3()
  {
    Tortoise.getBackgroundWindow().addMouseRightClickListener(this);
  }
  @Override
  public void question4()
  {
    new Text("Home Run!").setPenColor(PenColors.Greens.LimeGreen).setTopLeft(105, 235)
        .addTo(Tortoise.getBackgroundWindow());
  }
  public static void main(String[] args)
  {
    new SimpleBubbleQuizGrader().grade(new SimpleBubbleQuiz());
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    if (counter < 3)
    {
      if (counter == 0)
      {
        this.answerQuestion1();
        question2();
        Text baseHit = new Text("Keep Running!");
        baseHit.setPenColor(PenColors.Oranges.Orange);
        baseHit.setTopLeft(105, 35).addTo(Tortoise.getBackgroundWindow());
      }
      drawNextBase();
      counter = counter + 1;
    }
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    if (counter != 3) { return; }
    this.answerQuestion3();
    question4();
    drawNextBase();
  }
}
