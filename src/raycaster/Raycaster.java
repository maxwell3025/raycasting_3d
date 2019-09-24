package raycaster;

import java.util.Arrays;

import vectors.Point4D;

public class Raycaster extends Bitmap{

	public Raycaster(int width, int height) {
		super(width, height);
		Arrays.fill(raster, 0xff000000);
	}
	public void Update(){
		float x, y;
		Point4D pos = new Point4D(1,0,0);
		for(int i = 0 ;i<raster.length;i++){
			x = (float)(i%width)/width;
			y = (float)(i/width)/height;
		}
	}
	private int CastRay(Point4D ray, Point4D pos){
		Point4D current = pos;
		Point4D step = ray.Mul(0.01f);
		boolean hit = false;
		for(int i = 0;i<1000;i++){
			if(current.y<0){
				hit = true;
				break;
			}
			current = current.Add(step);
		}
		if(hit){
			int checker = (int)current.x^(int)current.y;
			return (checker&1)==0?0xff000000:-1;
		}
		return 0xff000000;
	}

}
