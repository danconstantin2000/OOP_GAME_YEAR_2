package Forest;
import javax.imageio.ImageIO;
import java.awt.*;

public class Bush extends ForestThings {
    public Bush(int x,int y) {
        this.x=x;
        this.y=y;
        height=30;
        width=70;
        try
        {
            image= ImageIO.read(getClass().getResourceAsStream("/MapObjects/Bush.png"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    public void draw(Graphics2D g)
    {
        super.draw(g);
    }
}
