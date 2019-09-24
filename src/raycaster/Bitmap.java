package raycaster;

import java.awt.image.BufferedImage;

public class Bitmap {
protected int[] raster;
protected int width;
protected int height;
	public Bitmap(int width, int height) {
		raster = new int[width*height];
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
		raster = new int[width*height];
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		raster = new int[width*height];
	}
	public void setColor(int x, int y, int color){
		raster[x+y*width]=color;
	}
	public int getColor(int x, int y){
		return raster[x+y*width];
	}
	public void copyToBufferedImage(BufferedImage image){
		image.setRGB(0, 0, width, height, raster, 0, width);
		System.out.println(image.getRGB(0, 0));
	}
}
