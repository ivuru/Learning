//16進表記と色名表記を相互変換


// colorconv.cs

using System;
using System.Drawing;

public class HtmlColorConversion {
  static void Main() {
    Color c;
    String htmlColor;

    // Red → #FF0000

    c = ColorTranslator.FromHtml("Red");
    htmlColor = String.Format("#{0:X2}{1:X2}{2:X2}", c.R, c.G, c.B);

    Console.WriteLine(htmlColor); // 出力：#FF0000

    // #FF0000 → Red

    // 色名は取得できない
    c = ColorTranslator.FromHtml(htmlColor);
    Console.WriteLine(c.Name); // 出力：ffff0000

    // 「#」を「0x」に置き換えれば取得できる
    c = ColorTranslator.FromHtml(htmlColor.Replace("#", "0x"));
    Console.WriteLine(c.Name); // 出力：Red
  }
}
