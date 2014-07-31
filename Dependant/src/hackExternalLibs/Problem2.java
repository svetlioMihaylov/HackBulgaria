package hackExternalLibs;

import java.awt.Image;
import java.io.IOException;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.nitido.utils.toaster.Toaster;

public class Problem2 {
public static void main(String[] args) throws IOException, InterruptedException {
    Toaster test=new Toaster();
  //  Image image = new ImageIcon((Image) Paths.get("resources", "LightHouse.jpg")).getImage();
   // test.setBackgroundImage(image);
    test.setDisplayTime(700);
    test.setToasterHeight(100);
    String imagePath = "resource/LightHouse.jpg";
    Image img = null;
    try {
        img = ImageIO.read(Paths.get("resources", "LightHouse.jpg").toFile());
    } catch (final IOException e) {
    }
    
    test.setStepTime(45);
    test.setStep(35);
  /*  InputStream imgStream = Problem2.class.getResourceAsStream(imagePath );
    BufferedImage myImg = ImageIO.read(imgStream);*/
    ImageIcon icon = new ImageIcon(img);
    while(true)
    {
        Thread.sleep(4000);
        test.showToaster( icon,"dfglfdjgdjfgjfdkgfdgkfdgfdkgk");
    }
   
  
    
}
}
