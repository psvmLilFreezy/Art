import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Lesson11 {
    public static void main(String[] args) {
        MyFrame window = new MyFrame();
    }
}


class MyFrame extends JFrame {
    public MyFrame() {
        MyPanel panel = new MyPanel();
        Container container = getContentPane();
        container.add(panel);
        setBackground(Color.MAGENTA);
        setBounds(0, 0, 1000, 800);
        setVisible(true);
    }
}


class MyPanel extends JPanel {
    private Image image;

    public MyPanel() {
        try {
           image = ImageIO.read(new File("D:\\Новая папка\\1.png"));
        } catch(IOException exception) {
            System.out.println("Ошибка загрузки картинки");
        }
    }

    public void paintComponent(Graphics graphics) {
        for (int i = 0; i <= 15; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawArc(4, 200, 500 - 2 * i, 150 + 2 * i, 50 * i, 40 * i);

        }
        graphics.setColor(Color.PINK);
        graphics.fillRect(500, 0, 300, 600);
        graphics.drawImage(image,700,500,null);
    }
}


