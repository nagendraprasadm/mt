package constructor;

/**
 * To illustreate private constructor capture idiom
 * @author nmanchur
 *
 */
public class SafePoint {
	
	private int x;
	private int y;
	
	public SafePoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public SafePoint(SafePoint sp){
		int[] xy = sp.getXY();
//		this(xy[0],xy[1]);
	}
	
	public synchronized int[] getXY(){
		return new int[]{x,y};
	}

}
