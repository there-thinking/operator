package arithmetic;

public class Logic {
	public static void main(String[] args) {
		//长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
		int i = 2;
		System.out.println( i== 1 & i++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
		System.out.println(i);
		
		//短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
		int j = 2;
		System.out.println( j== 1 && j++ ==2  );  //因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
		System.out.println(j);	
		
		//长路或  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int a = 2;
        System.out.println( a== 1 | a++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(a);
         
        //短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
        int b = 2;
        System.out.println( b== 2 || b++ ==2  );  //因为j==2返回true,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(b);     
        
        boolean c = true;
        
        System.out.println(c); //输出true
        System.out.println(!c);//输出false
        
        boolean x = true;
        boolean y = false;
         
        System.out.println(x^y); //不同返回真
        System.out.println(x^y); //相同返回假
		
	}
}