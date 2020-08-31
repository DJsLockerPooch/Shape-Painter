package shapeprinter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

public class Elipse extends Shape {

    private Ellipse2D ell;

    public Elipse(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
        ell = new Ellipse2D.Double(x, y, w, h);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, w, h);
    }

    @Override
    public boolean hitTest(int x, int y) {
        return ell.contains(x, y);
    }

}
