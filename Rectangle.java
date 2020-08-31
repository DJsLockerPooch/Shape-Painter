package shapeprinter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {

    private Rectangle2D rect;

    public Rectangle(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
        rect = new Rectangle2D.Double(x, y, w, h);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }

    @Override
    public boolean hitTest(int x, int y) {
        return rect.contains(x,y);
    }

}
