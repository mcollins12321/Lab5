/**
 * 
 */
package pokerEnums;

/**
 * @author GE60
 *
 */
public enum eDraw {
	DrawPlayer(1),
	DrawCommon(2);
	
	private int Draw;
	
	private eDraw(final int Draw) {
		this.Draw=Draw;
	}

	/**
	 * @return the draw
	 */
	public int getDraw() {
		return Draw;
	}
	
}
	


