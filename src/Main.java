import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args)
	{
		BaseInfo baseInfo = new BaseInfo();
		CreateCashflow cf = new CreateCashflow();
		
		/* 채권 발행정보 */
		Map issInfo = baseInfo.issueIfno();
				
		/* 채권 매입 거래 정보 */
		Map trdInfo = baseInfo.trdIfno();
		
		/* 채권 매입 Cashflow 생성 정보*/
		Map cfInfo = new HashMap();
		
		cfInfo.putAll(issInfo);
		cfInfo.putAll(trdInfo);
		
		//List<?> cfList = cf.createCf(cfInfo);
		
		System.out.println(issInfo);
		System.out.println(trdInfo);
		System.out.println(cfInfo);
	}
}
