import java.awt.*;
import javax.swing.*;

public class ColorPalette extends JFrame {

    public ColorPalette() {
        setTitle("Color Palette");
        setSize(400, 300);
        setLayout(new GridLayout(2, 4));

        Color[] colors = {
            Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW,
            Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA
        };

        String[] names = {
            "Red", "Green", "Blue", "Yellow",
            "Orange", "Pink", "Cyan", "Magenta"
        };

        for (int i = 0; i < colors.length; i++) {
            JPanel panel = new JPanel();
            panel.setBackground(colors[i]);

            JLabel label = new JLabel(names[i]);
            panel.add(label);

            add(panel);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPalette();
    }
}
