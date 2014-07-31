package car;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class Car {
    public static void main(String[] args) {

        BufferedImage img = null;
        try {
            img = ImageIO.read(Paths.get(args[0]).toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        final StringBuilder builder = new StringBuilder();
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                Color col = new Color(img.getRGB(x, y), false);
                int test = (col.getGreen() + col.getRed() + col.getBlue()) / 3;
                if (test > 240) {
                    System.out.print(" ");
                } else if (test > 200) {
                    System.out.print(".");
                } else if (test > 160) {
                    System.out.print("*");
                } else if (test > 120) {
                    System.out.print("+");
                } else if (test > 80) {
                    System.out.print("x");
                } else if (test > 40) {
                    System.out.print("#");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}
