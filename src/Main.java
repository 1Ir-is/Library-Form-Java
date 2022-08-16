import javax.swing.SwingUtilities;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Form running = new Form();
                running.prepareGUI();
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

}