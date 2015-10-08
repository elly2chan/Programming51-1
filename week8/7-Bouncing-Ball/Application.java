import javax.swing.JFrame;

public class Application extends JFrame {

  public Application() {
    add(new Canvas4());

    setResizable(false);
    pack();

    setTitle("BBall");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    Application app = new Application();
    app.setVisible(true);
  }
}
