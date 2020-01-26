package prima;

public class Operation {
	
	public IOperation getCal() {
		return cal;
	}
	public void setCal(IOperation cal) {
		this.cal = cal;
	}
	IOperation cal;

	public int addTwoNumbers(int x, int y){
		return cal.add(x, y);
	}
	public int substractTwoNumbers(int x, int y){
		return cal.sub(x, y);
	}
	public int MulTwoNumbers(int x, int y){
		return cal.mul(x, y);
	}
	
}
