package shapeprinter;

import java.awt.Color;

public class ShapePrinterframe extends javax.swing.JFrame {

    public ShapePrinterframe() {
        currShape = ShapeType.ELIPSE;
        currColor = Color.BLACK;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shapeComponent1 = new shapeprinter.ShapeComponent();
        jPanel1 = new javax.swing.JPanel();
        AreaLabel = new javax.swing.JLabel();
        AreaDisplay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ClearMenuItem = new javax.swing.JMenuItem();
        Area = new javax.swing.JMenuItem();
        Delete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Red = new javax.swing.JMenuItem();
        Orange = new javax.swing.JMenuItem();
        Yellow = new javax.swing.JMenuItem();
        Green = new javax.swing.JMenuItem();
        Blue = new javax.swing.JMenuItem();
        Purple = new javax.swing.JMenuItem();
        Black = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Rectangle = new javax.swing.JMenuItem();
        Elipse = new javax.swing.JMenuItem();
        Triangle = new javax.swing.JMenuItem();
        House = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shapeComponent1.setPreferredSize(new java.awt.Dimension(1200, 800));
        shapeComponent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                shapeComponent1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shapeComponent1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shapeComponent1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout shapeComponent1Layout = new javax.swing.GroupLayout(shapeComponent1);
        shapeComponent1.setLayout(shapeComponent1Layout);
        shapeComponent1Layout.setHorizontalGroup(
            shapeComponent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        shapeComponent1Layout.setVerticalGroup(
            shapeComponent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        getContentPane().add(shapeComponent1, java.awt.BorderLayout.CENTER);

        AreaLabel.setText("The Total Area of All Shapes is:");
        jPanel1.add(AreaLabel);

        AreaDisplay.setText("0");
        jPanel1.add(AreaDisplay);

        jLabel1.setText("pixels squared.");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("File");

        ClearMenuItem.setText("Clear");
        ClearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ClearMenuItem);

        Area.setText("Compute Area");
        Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaActionPerformed(evt);
            }
        });
        jMenu1.add(Area);

        Delete.setText("Delete Shape");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jMenu1.add(Delete);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Color");

        Red.setText("Red");
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });
        jMenu2.add(Red);

        Orange.setText("Orange");
        Orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrangeActionPerformed(evt);
            }
        });
        jMenu2.add(Orange);

        Yellow.setText("Yellow");
        Yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowActionPerformed(evt);
            }
        });
        jMenu2.add(Yellow);

        Green.setText("Green");
        Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenActionPerformed(evt);
            }
        });
        jMenu2.add(Green);

        Blue.setText("Blue");
        Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueActionPerformed(evt);
            }
        });
        jMenu2.add(Blue);

        Purple.setText("Purple");
        Purple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurpleActionPerformed(evt);
            }
        });
        jMenu2.add(Purple);

        Black.setText("Black");
        Black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackActionPerformed(evt);
            }
        });
        jMenu2.add(Black);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Shape");

        Rectangle.setText("Rectangle");
        Rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleActionPerformed(evt);
            }
        });
        jMenu3.add(Rectangle);

        Elipse.setText("Elipse");
        Elipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElipseActionPerformed(evt);
            }
        });
        jMenu3.add(Elipse);

        Triangle.setText("Triangle");
        Triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriangleActionPerformed(evt);
            }
        });
        jMenu3.add(Triangle);

        House.setText("House");
        House.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseActionPerformed(evt);
            }
        });
        jMenu3.add(House);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearMenuItemActionPerformed
        shapeComponent1.clear();
        totalShapeArea = 0;
        AreaDisplay.setText(Integer.toString(0));
    }//GEN-LAST:event_ClearMenuItemActionPerformed

    private void GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenActionPerformed
        currColor = Color.GREEN;
    }//GEN-LAST:event_GreenActionPerformed

    private void BlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackActionPerformed
        currColor = Color.BLACK;
    }//GEN-LAST:event_BlackActionPerformed

    private void shapeComponent1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shapeComponent1MousePressed
        begX = evt.getX();
        begY = evt.getY();
    }//GEN-LAST:event_shapeComponent1MousePressed

    private void shapeComponent1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shapeComponent1MouseReleased
        int endX = evt.getX();
        int endY = evt.getY();

        int width = Math.abs(begX - endX);
        int height = Math.abs(begY - endY);
        x = Math.min(endX, begX);
        y = Math.min(begY, endY);

        if (width < 30 && height < 30) {
            return;
        }

        switch (currShape) {
            case ELIPSE:
                Elipse e = new Elipse(x, y, width, height, currColor);
                shapeComponent1.addShape(e);
                totalShapeArea += Math.round(Math.PI * (width / 2) * (height / 2));
                break;
            case RECTANGLE:
                Rectangle r = new Rectangle(x, y, width, height, currColor);
                shapeComponent1.addShape(r);
                totalShapeArea += (width * height);
                break;
            case TRIANGLE:
                Triangle t = new Triangle(x, y, width, height, currColor);
                shapeComponent1.addShape(t);
                // Area of a triangle
                totalShapeArea += 0.5 * (width * height);
                break;
            case HOUSE:
                House h = new House(x, y, width, height, currColor);
                shapeComponent1.addShape(h);
                // Area of a "house" shape
                totalShapeArea += ((height * 2 / 3) * width) + ((width / 2) * (height * 1 / 3));
                break;

        }
    }//GEN-LAST:event_shapeComponent1MouseReleased

    private void shapeComponent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shapeComponent1MouseClicked
        shapeComponent1.handleClick(evt.getX(), evt.getY(), currColor);

        // Check and see if the delete button has been clicked, and will
        // delete the top most shape if clicked.
        if (deleteClicked) {
            shapeComponent1.deleteShape(evt.getX(), evt.getY());
            deleteClicked = false;
        }
    }//GEN-LAST:event_shapeComponent1MouseClicked

    private void BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueActionPerformed
        currColor = Color.BLUE;
    }//GEN-LAST:event_BlueActionPerformed

    private void RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
        currColor = Color.RED;
    }//GEN-LAST:event_RedActionPerformed

    private void RectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleActionPerformed
        currShape = ShapeType.RECTANGLE;
    }//GEN-LAST:event_RectangleActionPerformed

    private void ElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElipseActionPerformed
        currShape = ShapeType.ELIPSE;
    }//GEN-LAST:event_ElipseActionPerformed

    private void AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaActionPerformed
        AreaDisplay.setText(Integer.toString(totalShapeArea));
    }//GEN-LAST:event_AreaActionPerformed

    private void TriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleActionPerformed
        currShape = ShapeType.TRIANGLE;
    }//GEN-LAST:event_TriangleActionPerformed

    private void HouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseActionPerformed
        currShape = ShapeType.HOUSE;
    }//GEN-LAST:event_HouseActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        deleteClicked = true;
    }//GEN-LAST:event_DeleteActionPerformed

    private void OrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrangeActionPerformed
        currColor = Color.ORANGE;
    }//GEN-LAST:event_OrangeActionPerformed

    private void YellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YellowActionPerformed
        currColor = Color.YELLOW;
    }//GEN-LAST:event_YellowActionPerformed

    private void PurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurpleActionPerformed
    currColor = Color.MAGENTA;
    }//GEN-LAST:event_PurpleActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShapePrinterframe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapePrinterframe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapePrinterframe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapePrinterframe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapePrinterframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Area;
    private javax.swing.JLabel AreaDisplay;
    private javax.swing.JLabel AreaLabel;
    private javax.swing.JMenuItem Black;
    private javax.swing.JMenuItem Blue;
    private javax.swing.JMenuItem ClearMenuItem;
    private javax.swing.JMenuItem Delete;
    private javax.swing.JMenuItem Elipse;
    private javax.swing.JMenuItem Green;
    private javax.swing.JMenuItem House;
    private javax.swing.JMenuItem Orange;
    private javax.swing.JMenuItem Purple;
    private javax.swing.JMenuItem Rectangle;
    private javax.swing.JMenuItem Red;
    private javax.swing.JMenuItem Triangle;
    private javax.swing.JMenuItem Yellow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private shapeprinter.ShapeComponent shapeComponent1;
    // End of variables declaration//GEN-END:variables
    private Color currColor;
    private ShapeType currShape;
    private int begX;
    private int begY;
    private int totalShapeArea;
    private int x;
    private int y;
    boolean deleteClicked = false;
}
