/*
       ����
       �жϵ�ǰ������:
          ����������ʱ��
             ����ɡ��
             �ж��Ա�
                ���Ը�Ϊ�У���һ�ѰѺ�ɡ
                ���Ա�ΪŮ����һ��С��ɡ
                
           ������������ʱ��
               �ж��������¶ȣ�
                  �������¶���30�ȵ����ϣ�
                    ���Ա�Ϊ�У���ī��
                    ���Ա�ΪŮ������˪
                    
       ��ʾ������״�����¶ȡ��Ա���Ҫ�Ӽ������롣
*/
public class IfElse03
{
	public static void main(String[] args)
	{
		 System.out.print("������������rain or sun��:");
		 java.util.Scanner s = new java.util.Scanner(System.in);
		 String weather = s.next();
		 System.out.println("���������Ϊ��" + weather);
		 
		 System.out.print("�������Ա�felmale or male��:");
		 java.util.Scanner m = new java.util.Scanner(System.in);
		 String sex = m.next();
		 System.out.println("������Ա�Ϊ��" + sex);
		 
		 if(weather.equals("rain")){  
		 	    
	         if(sex.equals("felmale")){
	       	      System.out.println("��һ��С��ɡ");
	         }else{
	     	        System.out.println("��һ�Ѵ��ɡ");
	         }
	    }    
	    else if(weather.equals("sun")){
	    
	   	      System.out.print("�������¶�:");
		 	      java.util.Scanner n = new java.util.Scanner(System.in);
		        int tem = n.nextInt();
		        System.out.println("������¶�Ϊ��" + tem);
	
	         if(tem >= 30 && sex.equals("felmale")){
	     	      
	       	       System.out.println("���ɹ˪");
	         }else if(tem >= 30 && sex.equals("male")){
	     	         System.out.println("��ī��");
	          }   
	   }else{
	   	     System.out.println("�Բ����������������������ڣ�");
	   }
		 	
	
	}
}