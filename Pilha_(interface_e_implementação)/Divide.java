public class Divide implements BinaryOperator{

	public String getSymbol(){
		return "/";
	}
	public int calculate(int a, int b){
		return a / b;
	}
	public String toString(){
		return "Operator / Divide";  
	}
}