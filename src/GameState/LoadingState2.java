package GameState;
import TileMap.Background;
import java.awt.*;
//GameState intermediar.De aici se face intrarea in Level1 State;

public class LoadingState2 extends GameState{

    private Background bg;
    private int currentChoice=0;
    private Color titleColor;
    private Font titleFont;
    private long timer;


    public LoadingState2(GameStateManager gsm)
    {
        this.gsm=gsm;
        try{
            init();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void init(){
        bg=new Background("/Backgrounds/LS2.png");
        titleColor=new Color(255,255,255);
        titleFont=new Font("Courier New",Font.BOLD,18);
        timer=System.nanoTime();
    }
    public void update(){
        long elapsed=(System.nanoTime()-timer)/1000000;

        if(elapsed>1000)
        {
            gsm.setState(GameStateManager.LEVEL2STATE);
        }

    }
    public void draw(Graphics2D g){
        //draw bg
        bg.draw(g);
        //draw title
        g.setColor(titleColor);
        g.setFont(titleFont);
        g.drawString("LOADING...",120,120);

    }

    public void keyPressed(int k) { }
    public void keyReleased(int k) { }

}