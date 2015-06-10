import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

import java.util.HashMap;

public class TextureManager implements Globals {
	private HashMap<String, BufferedImage> textures;

	public TextureManager() {
		textures = new HashMap<String, BufferedImage>();
	}

	public void addTexture(String name, String filename) {
		BufferedImage image;
		try {
			image = ImageIO.read(new File(filename));
			textures.put(name, image);
		} catch (Exception e) {
			System.err.print("ADDTEXTURE BROKE");
			System.exit(0);
		}
	}

	public BufferedImage getTexture(String name) {
		return textures.get(name);
	}
}