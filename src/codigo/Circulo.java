package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author alber
 */
public class Circulo extends Ellipse2D.Double {

    Color color = null;
    boolean relleno = false;

    public Circulo(int _posX, int _posY, int _radio, Color _color, boolean _relleno) {
        super();
        this.x = _posX;
        this.y = _posY;
        this.width = _radio;
        this.height = _radio;
        this.color = _color;
        this.relleno = _relleno;
    }
    
    public void dibujate (Graphics2D g2){
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }else {
            g2.draw(this);
        }
        
    }
}
