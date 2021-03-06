//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;
//import java.io.IOException;
//import java.net.URL;
// 
//public class ImgDiffPercent
//{
//  public static void main(String args[])
//  {
//    BufferedImage img1 = null;
//    BufferedImage img2 = null;
//    try {
//      URL url1 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Red_circle.svg/200px-Red_circle.svg.png");
//      URL url2 = new URL("http://vignette2.wikia.nocookie.net/bravefrontierglobal/images/5/52/Small_red_circle.png/revision/latest?cb=20150913112541");
//      img1 = ImageIO.read(url1);
//      img2 = ImageIO.read(url2);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    int width1 = img1.getWidth(null);
//    int width2 = img2.getWidth(null);
//    int height1 = img1.getHeight(null);
//    int height2 = img2.getHeight(null);
//    if ((width1 != width2) || (height1 != height2)) {
//      System.err.println("Error: Images dimensions mismatch");
//      System.exit(1);
//    }
//    long diff = 0;
//    for (int y = 0; y < height1; y++) {
//      for (int x = 0; x < width1; x++) {
//        int rgb1 = img1.getRGB(x, y);
//        int rgb2 = img2.getRGB(x, y);
//        int r1 = (rgb1 >> 16) & 0xff;
//        int g1 = (rgb1 >>  8) & 0xff;
//        int b1 = (rgb1      ) & 0xff;
//        int r2 = (rgb2 >> 16) & 0xff;
//        int g2 = (rgb2 >>  8) & 0xff;
//        int b2 = (rgb2      ) & 0xff;
//        diff += Math.abs(r1 - r2);
//        diff += Math.abs(g1 - g2);
//        diff += Math.abs(b1 - b2);
//      }
//    }
//    double n = width1 * height1 * 3; 
//    double p = diff / n / 255.0;  // Anyone know what the 255 is for?
//    System.out.println("diff percent: " + (p * 100.0));
//  }
//}