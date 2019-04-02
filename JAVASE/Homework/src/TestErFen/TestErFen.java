package TestErFen;

public class TestErFen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5,8,1,9,3,7,0};
		
		boolean b = binarySearch(a,8);
		
		if(b) {
			System.out.println("查到");
		}else {
			System.out.println("没有查到");
		}
		
		
	}
	
	public static boolean binarySearch(int a[], int m) {
		
		int temp =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length-i-1;j++) {
				if(a[j] < a[j+1]) {
					temp = a[j];
					a[j] =a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int x=0;
		int y=a.length-1;
		int k=(x+y)/2;
		
		while(x <= y) {
			if(a[k]>m) {
				y = k-1;
			}else if(a[k]<m) {
				x = k+1;
			}else if(a[k] == m) {
				return true;
			}
			k = (x+y)/2;
		}
		return false;
	}

}
