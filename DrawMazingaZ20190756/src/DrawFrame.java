import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DrawFrame extends JFrame{
    MazingaPanel mazingaPanel;
    static int difX = 7;
    static int difY = 29;
    DrawFrame(){
        setTitle("DrawFrame");
        setSize(900,750);   // height - 50
        setLocation(300,50);
        /*Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int screenHeight = d.height;
        int screenWidth = d.width;
        setSize(screenWidth*2/3, screenHeight*2/3);
        setLocation(screenWidth / 6, screenHeight / 6);*/

        Container container = this.getContentPane();
        mazingaPanel = new MazingaPanel();
        container.add(mazingaPanel);

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int x, y;
                x = e.getX();
                y = e.getY();
                System.out.println("x: " + (x - difX) + ", y: " + (y-difY) + ",");
            };
        });


        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
