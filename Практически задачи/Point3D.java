package recursion;

public class Point3D extends Point2D {
       private float z = 0.0f;
       
       public Point3D(float x, float y,float z) {
    	   super(x,y);
    	   this.setZ(z);
       }
       public Point3D() {
    	   
       }
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y,float z) {
	    x=super.getX();
	    y=super.getY();
		this.z = z;
	}
	public float getXYZ() {
		float arr[]= {super.getX(),super.getY(),z};
		return arr[0] + arr[1] + arr[2];
	}
	
	public String toString() {
		return super.toString()+" "+String.valueOf(getZ());
	}
	
	
	
}
