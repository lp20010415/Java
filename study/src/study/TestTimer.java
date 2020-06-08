package study;
public class TestTimer {
	 
	public static void main(String[] args) {
		start();
		
		destoryed();
		
		start();
 
	}
	
	private static void start(){
		MybTimeTask.getInstance().start(true);
	}
	
	private static void destoryed(){
		MybTimeTask.getInstance().destroyed();
	}
	
}
