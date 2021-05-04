package Forest;

import Entity.MapObject;
import Main.GamePanel;
import TileMap.TileMap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

//Clasa abstracta pentru obiecte de decor a padurii(copaci,ruine,tufisuri)
public abstract class ForestThings {

    protected BufferedImage image;
    protected int x;
    protected int y;
    protected int xmap;
    protected int ymap;
    protected int width;
    protected int height;
    public void setMapPosition(int x,int y)
    {
        xmap=x;
        ymap=y;
    }

    public void draw(Graphics2D g)
    {
        if(notOnScreen())
        {
            return;
        }
        g.drawImage(image,x+xmap-width/2,y+ymap-height/2+5,null);
    }
    public boolean notOnScreen() {
        return x + xmap + width < 0 ||
                x + xmap - width > GamePanel.WIDTH ||
                y + ymap + height < 0 ||
                y + ymap - height > GamePanel.HEIGHT;
    }

}
