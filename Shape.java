package shapeprinter;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

    protected int x, y, w, h;
    protected Color color;

    public Shape(int x, int y, int w, int h, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics g);

    public abstract boolean hitTest(int x, int y);

}
