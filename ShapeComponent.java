package shapeprinter;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class ShapeComponent extends JComponent {

    private ArrayList<Shape> shapes;

    public ShapeComponent() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
        repaint();
    }

    public void clear() {
        shapes.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

    public void handleClick(int x, int y, Color c) {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            Shape s = shapes.get(i);

            if (s.hitTest(x, y)) {
                s.setColor(c);
                repaint();
                break;
            }
        }
    }

    // Same exact code as handleClick, except it removes the object
    // from the shapes list, and then repaints the canvas.
    public void deleteShape(int x, int y) {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            Shape s = shapes.get(i);

            if (s.hitTest(x, y)) {
                shapes.remove(s);
                repaint();
                break;
            }
        }
    }
}
