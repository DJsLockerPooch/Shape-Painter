package shapeprinter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends Shape {

    private Polygon tri;
    private int[] xpoints;
    private int[] ypoints;

    public Triangle(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
        xpoints = new int[3];
        ypoints = new int[3];
        xpoints[0] = x + (w / 2);
        xpoints[1] = x;
        xpoints[2] = x + w;
        ypoints[0] = y;
        ypoints[1] = y + h;
        ypoints[2] = y + h;
        tri = new Polygon(xpoints, ypoints, 3);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xpoints, ypoints, 3);
    }

    @Override
    public boolean hitTest(int x, int y) {
        return tri.contains(x, y);
    }

}
