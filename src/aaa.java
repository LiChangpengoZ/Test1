import java.util.ArrayList;
import java.util.List;

public class aaa {

	public static void main(String[] args) {
		int al;
		String aa= "第二次修改";
//		double sum=9;
//		int finalSum=(int) sum;
//		int finalTemp=0;
//		int mathSum=(int) sum;
//		List<Integer> list=new ArrayList<Integer>();
//		a:while(true){
//			//每次除以2的是减去数的sum
//			sum=mathSum;
//			sum=sum/2;
//			int temp=1;
//			while(true) {
//				if(temp>sum) {
//					list.add((int)temp);
//					finalTemp=finalTemp+temp;
//					mathSum=mathSum-temp;
////					System.out.println(finalSum+"+"+finalTemp);
//					if(finalSum==finalTemp) {
//						break a;
//					}
//					break;
//				}
//				temp*=2;
//			}
//			
//			System.out.println(sum);
//			if(sum<=1 || (Math.log((double)sum)/Math.log((double)2))%1==0 ) {
//				break;
//			}
//		}
//		System.out.println(list);
//		
////		System.out.println(Math.log((double)0)/Math.log((double)2));
//	
		fun("6");
		
	}
	private static void fun(String sumStr) {
		double sum=Integer.valueOf(sumStr);
		int finalSum=(int) sum;				//用于比较
		int finalTemp=0;				//用于比较
		int mathSum=(int) sum;			//减去后的sum
		List<Integer> list=new ArrayList<Integer>();
		a:while(true){
			//每次除以2的是减去数的sum
			sum=mathSum;
			sum=sum/2;
			int temp=1;
			while(true) {
				if(temp>sum) {
					list.add(temp);
					finalTemp=finalTemp+temp;
					mathSum=mathSum-temp;
//					System.out.println(finalSum+"+"+finalTemp);
					if(finalSum==finalTemp) {
						break a;
					}
					break;
				}
				temp*=2;
			}
			
//			System.out.println(sum);
			if(sum<=1) {
				break;
			}
		}
		System.out.println(list);
	}
	
}
