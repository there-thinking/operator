package arithmetic;

public class Logic {
	public static void main(String[] args) {
		//��·��  ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		int i = 2;
		System.out.println( i== 1 & i++ ==2  ); //�������i++���ᱻִ�У�����i��ֵ�����3
		System.out.println(i);
		
		//��·�� ֻҪ��һ�����ʽ��ֵ��false�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int j = 2;
		System.out.println( j== 1 && j++ ==2  );  //��Ϊj==1����false,�����ұߵ�j++��û��ִ���ˣ�����j��ֵ������2
		System.out.println(j);	
		
		//��·��  ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
        int a = 2;
        System.out.println( a== 1 | a++ ==2  ); //�������i++���ᱻִ�У�����i��ֵ�����3
        System.out.println(a);
         
        //��·�� ֻҪ��һ�����ʽ��ֵ��true�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
        int b = 2;
        System.out.println( b== 2 || b++ ==2  );  //��Ϊj==2����true,�����ұߵ�j++��û��ִ���ˣ�����j��ֵ������2
        System.out.println(b);     
        
        boolean c = true;
        
        System.out.println(c); //���true
        System.out.println(!c);//���false
        
        boolean x = true;
        boolean y = false;
         
        System.out.println(x^y); //��ͬ������
        System.out.println(x^y); //��ͬ���ؼ�
		
	}
}