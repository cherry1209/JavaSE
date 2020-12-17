/*
       需求：
       判断当前的天气:
          当外边下雨的时候：
             带雨伞：
             判断性别：
                当性格为男：带一把把黑伞
                当性别为女：带一把小花伞
                
           当外边是晴天的时候：
               判断天气的温度：
                  当天气温度在30度的以上：
                    当性别为男：戴墨镜
                    当性别为女：擦防霜
                    
       提示：天气状况、温度、性别需要从键盘输入。
*/
public class IfElse03
{
	public static void main(String[] args)
	{
		 System.out.print("请输入天气【rain or sun】:");
		 java.util.Scanner s = new java.util.Scanner(System.in);
		 String weather = s.next();
		 System.out.println("输入的天气为：" + weather);
		 
		 System.out.print("请输入性别【felmale or male】:");
		 java.util.Scanner m = new java.util.Scanner(System.in);
		 String sex = m.next();
		 System.out.println("输入的性别为：" + sex);
		 
		 if(weather.equals("rain")){  
		 	    
	         if(sex.equals("felmale")){
	       	      System.out.println("带一把小花伞");
	         }else{
	     	        System.out.println("带一把大黑伞");
	         }
	    }    
	    else if(weather.equals("sun")){
	    
	   	      System.out.print("请输入温度:");
		 	      java.util.Scanner n = new java.util.Scanner(System.in);
		        int tem = n.nextInt();
		        System.out.println("输入的温度为：" + tem);
	
	         if(tem >= 30 && sex.equals("felmale")){
	     	      
	       	       System.out.println("搽防晒霜");
	         }else if(tem >= 30 && sex.equals("male")){
	     	         System.out.println("戴墨镜");
	          }   
	   }else{
	   	     System.out.println("对不起，你输入的天气情况不存在！");
	   }
		 	
	
	}
}