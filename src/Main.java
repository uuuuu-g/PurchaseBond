import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args)
	{
		BaseInfo baseInfo = new BaseInfo();
		CreateCashflow cf = new CreateCashflow();
		
		/* ä�� �������� */
		Map issInfo = baseInfo.issueIfno();
				
		/* ä�� ���� �ŷ� ���� */
		Map trdInfo = baseInfo.trdIfno();
		
		/* ä�� ���� Cashflow ���� ����*/
		Map cfInfo = new HashMap();
		
		cfInfo.putAll(issInfo);
		cfInfo.putAll(trdInfo);
		
		//List<?> cfList = cf.createCf(cfInfo);
		
		System.out.println(issInfo);
		System.out.println(trdInfo);
		System.out.println(cfInfo);
	}
}
