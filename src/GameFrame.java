import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //if we add components to JFrame, this pack function is going to take our JFrame and fit it snuggly around all of the components that we add to the frame
        this.pack();
        this.setVisible(true);
        //if we want this window to appear in the middle of our computer screen
        this.setLocationRelativeTo(null);
    }
}
