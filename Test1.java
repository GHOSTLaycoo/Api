package unit3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws ParseException {
		System.out.println("��������ĳ������£���yyyy-mm-dd��ʽ��");
		Scanner scan = new Scanner(System.in);
		String bir = scan.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date birth = sdf.parse(bir);
		
		Date now = new Date();
		long time = now.getTime() - birth.getTime();
	    //System.out.println("���Ѿ�����"+time+"����");
		long day = time/1000/60/60/24;
		long hour = (time%86400000)/3600000;
		long minute = (time%86400000%3600000)/60000;
		long second = (time%86400000%3600000%60000)/1000;
		long msec = time%86400000%3600000%60000%1000;
		System.out.println("��ϲ�����"+day+"��"+hour+"Сʱ"+minute+"����"+second+"��"+msec+"����");
		long s = 36500 - day;
		System.out.println("����һ���껹��"+s+"��");
		
		 s = s*60*60*1000*24;
		now.setTime(now.getTime()+s);
		
		System.out.println(sdf.format(now)+"�����100�������");
	}

}
