package test1;

public class Calculator {
	private static int result;//��̬���������ڴ洢���н��
	public void add(int n){
		result=result+n;
	}
	public void substract(int n){
		result=result-1;
	}
	public void multiply(int n){
		result=n*n;
	}
	public void divid(int n){
		result=result/n;
	}
	public void squareRoot(int n){
		for(;;);  //bug ��ѭ��
	}
	public void clear(){
		result=0;
	}
	public int getResult(){
		return result;
	}

}
