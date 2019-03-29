package HomeworkString;

public class TextMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TextMath a = new TextMath();
		a.test(10,20);
	}

    void test(int m,int n) {
		
		for(int i=0; i<10;i++) {
			int num = (int)(Math.random()*(n-m+1)+m);
			System.out.println(num);
		}
	}
}
