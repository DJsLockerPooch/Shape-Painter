package shapeprinter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class House extends Shape {

    private Polygon house;
    private int[] xpoints;
    private int[] ypoints;

    public House(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
        xpoints = new int[5];
        ypoints = new int[5];
        xpoints[0] = x;
        ypoints[0] = y + h;
        xpoints[1] = x;
        ypoints[1] = y + (h / 3);
        xpoints[2] = x + (w / 2);
        ypoints[2] = y;
        xpoints[3] = x + w;
        ypoints[3] = y + (h / 3);
        xpoints[4] = x + w;
        ypoints[4] = y + h;
        house = new Polygon(xpoints, ypoints, 5);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xpoints, ypoints, 5);
    }

    @Override
    public boolean hitTest(int x, int y) {
        return house.contains(x, y);
    }
    
}
