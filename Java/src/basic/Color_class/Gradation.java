// アプレット 色の利用
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

// <applet code="Ex_Color02" width=255 height=200> </applet>

public class Gradation extends Applet {
  public void paint(Graphics g) {
    int i;
    for (i = 0; i <= 255; i++){
// 色の作成
      Color C = new Color(0, 0, i);
      g.setColor(C);
      g.drawLine(i, 0, i, 200);
    }
  }
}
