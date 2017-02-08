/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author alber
 */
public class Triangulo extends Polygon{
    Color color = null;
    boolean relleno = false;

     public Triangulo(int _posX, int _posY, int _altura, Color _color, boolean _relleno) {
        super();
        
        this.npoints = 3;
        
        int altura = 220;
        float mediaBase = (float)(altura/Math.tan(Math.toRadians(60)));
        
        this.xpoints[0] = _posX;
        this.ypoints[0] = _posY;
        
        this.xpoints[1] = (int)(_posX + mediaBase);
        this.ypoints[1] = _posY + altura;
        
        this.xpoints[2] = (int)(_posX - mediaBase);
        this.ypoints[2] = _posY + altura;
        
        
        this.color = _color;
        this.relleno = _relleno;
    }
     

    public void dibujate(Graphics2D g2, int posX) {

        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }

    }
}

