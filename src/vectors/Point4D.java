package vectors;

public class Point4D {
public float x, y, z, w;
	public Point4D(float x, float y, float z, float w) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.w=w;
	}
	public Point4D(float x, float y, float z) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.w=1;
	}
	public float Dot(Point4D other){
		return (x*other.x)+(y*other.y)+(z*other.z);
	}
	public Point4D Project(Point4D other){
		return other.Mul(Dot(other)/other.Dot(other));
	}
	public Point4D Mul(float other){
		return new Point4D(x*other,y*other,z*other);
	}
	public Point4D Add(Point4D other){
		return new Point4D(x+other.x,y+other.y,z+other.z);
	}
	public Point4D Sub(Point4D other){
		return new Point4D(x-other.x,y-other.y,z-other.z);
	}
}
