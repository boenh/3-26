import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;


public class Steganography {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Picture beach = new Picture ("beach.jpg");
//		beach.explore();
//		Picture copy = testClearLow(beach);
//		copy.explore(); 
		
//		Picture beach2 = new Picture ("beach.jpg");
//		beach2.explore();
//		Picture copy2 = testSetLow(beach2, Color.PINK);
//		copy2.explore();
//		
//		Picture copy3 = revealPicture(copy2);
//		copy3.explore(); 
		
		String[] tempList = {"beach.jpg", "arch.jpg", "barbaraS.jpg", "blue-mark.jpg", "blueMotorcycle.jpg", "caterpillar.jpg", 
				"CumberlandIsland.jpg", "femaleLionAndHall.jpg", "flower1.jpg", "flower2.jpg", "gorge.jpg", "jenny-red.jpg", 
				"KatieFancy.jpg", "kitten2.jpg", "koala.jpg", "leftArrow.gif", "moon-surface.jpg", "msg.jpg", "redMotercycle.jpg", 
				"rightArrow.gif", "robot.jpg", "snowman.jpg", "swan.jpg", "temple.jpg", "thruDoor.jpg", "wall.jpg", "water.jpg",
				"whiteFlower.jpg"};
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < tempList.length; i ++) {
			list.add(tempList[i]);
		}
		
		Picture pic1 = new Picture();
		Picture pic2 = new Picture();
//		int xx = 0;
//		int yy = 0;
//		while (xx == yy) {
//			xx = (int)(Math.random()*list.size())-1;
//			yy = (int)(Math.random()*list.size())-1;
//			
//		}
//		pic1 = new Picture (list.get(xx));
//		pic2 = new Picture (list.get(yy));
		pic1 = new Picture (list.get(0));
		pic2 = new Picture (list.get(3));
		System.out.println();
		if (canHide(pic1, pic2)) {
			Picture pic3 = new Picture(hidePicture(pic1, pic2));
			
			pic3.explore();
			Picture pic4 = new Picture(revealPicture(pic3));
			pic4.explore();
		}
		else {
			System.out.println("picture does not fit");
		}
//		Picture beach2 = new Picture ("arch.jpg");
//		beach2.explore();
//		Picture copy2 = testSetLow(beach2, Color.PINK);
//		copy2.explore();


	}
	public static void clearLow( Pixel p )
	{
	/* To be implemented */
		p.setRed(((p.getRed()/4))*4);
		p.setBlue(((p.getBlue()/4))*4);
		p.setGreen(((p.getGreen()/4))*4);
	}
	
	public static Picture testClearLow(Picture pp) {
		Picture pp2 = new Picture(pp.getHeight(), pp.getWidth());
		for (int i = 0; i < pp.getHeight(); i ++) {
			for (int j = 0; j < pp.getWidth(); j ++) {
				pp2.setBasicPixel(j, i, pp.getBasicPixel(j, i));

			}
		}
		for (int r = 0; r < pp.getHeight(); r++) {
			for (int c =0; c<pp.getWidth(); c ++) {
				clearLow(pp2.getPixel(c, r));
			}
		}
		return pp2;
	}
	
	public static void setLow (Pixel p, Color c)
	{
	/* To be implemented */
		clearLow(p);
		p.setRed(p.getRed()+(c.getRed()/64));
		p.setBlue(p.getBlue()+(c.getBlue()/64));
		p.setGreen(p.getGreen()+(c.getGreen()/64));
		
		
	}
	
	public static Picture testSetLow(Picture pp, Color b) {
		Picture pp2 = new Picture(pp.getHeight(), pp.getWidth());
		for (int i = 0; i < pp.getHeight(); i ++) {
			for (int j = 0; j < pp.getWidth(); j ++) {
				pp2.setBasicPixel(j, i, pp.getBasicPixel(j, i));

			}
		}
		for (int r = 0; r < pp.getHeight(); r++) {
			for (int c =0; c<pp.getWidth(); c ++) {
				setLow(pp2.getPixel(c, r), b);
			}
		}
		return pp2;
	}
	
	public static Picture revealPicture(Picture hidden)
	{
	Picture copy = new Picture(hidden);
	Pixel[][] pixels = copy.getPixels2D();
	Pixel[][] source = hidden.getPixels2D();
	for (int r = 0; r < pixels.length; r++)
		
	{
		for (int c = 0; c < pixels[0].length; c++)
		{
			Color col = source[r][c].getColor();
			col.getRed();
			int red = (col.getRed()/64) * 64;
			int blue = (col.getBlue()/64) * 64;
			int green = (col.getGreen()/64) * 64;
			

			pixels[r][c].setRed(red);
			pixels[r][c].setBlue(blue);
			pixels[r][c].setGreen(green);
		
		}
	}
	return copy; 
	}
	public static boolean canHide(Picture source, Picture secret) {
		if (source.getWidth() == secret.getWidth() && source.getHeight() == secret.getHeight()) {
			return true;
		}
		return false;
	}
	
	public static Picture hidePicture(Picture source, Picture secret) {
		Picture pic = new Picture(source.getWidth(), source.getHeight());
		for (int i = 0; i < source.getHeight(); i ++) {
			for (int j = 0; j < source.getWidth(); j ++) {
				pic.setBasicPixel(j, i, source.getBasicPixel(j, i));

			}
		}
		Pixel[][] pixels = secret.getPixels2D();
		for (int r = 0; r < source.getHeight(); r++) {
			for (int c =0; c<source.getWidth(); c ++) {
				Color cc = pixels[c][r].getColor();
				setLow(pic.getPixel(c, r), cc);
			}
		}
		return pic;
	}
	

}
