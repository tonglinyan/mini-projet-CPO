package miniprojet;

import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.ArrayList;

public class Image {
	public static BufferedImage background = null;
	public static BufferedImage personnage = null;
	public static ArrayList<BufferedImage> nuages = new ArrayList<BufferedImage>();
	public static BufferedImage tonneau = null;
	
	public static void initialisation() {
		try {
			background = ImageIO.read(new File("fond.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	
		try {
			personnage = ImageIO.read(new File("personnage.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			tonneau = ImageIO.read(new File("tonneau.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 2; i++) {
			try {
				nuages.add(ImageIO.read(new File("nuage"+i+".png")));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
