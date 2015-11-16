/**
 * 
 */
package pokerEnums;

/**
 * @author GE60
 *
 */
public enum eCheckGameEval {
	Normal(1),
	TexasHoldEm(2),
	Omaha(3),
	SevenCard(4);
	
	private int Eval;
	private eCheckGameEval(final int Eval) {
		this.Eval=Eval;
	}
	public int getEval() {
		return Eval;
	}
}
