import java.util.HashMap;
import java.util.Map;

public class BaseInfo {
	
	/*채권 발행 정보*/
	public Map issueIfno()
	{
		Map<String, Object> bond = new HashMap<String, Object>(); 
		
		bond.put("itemCd"		, "");
		bond.put("itemName"		, "");
		bond.put("issDate"		, "");
		bond.put("matDate"		, "");
		bond.put("issAmt"		, "94690000000000");
		bond.put("issBalAmt"	, "69950000000000");
		bond.put("matReMthd"	, "100"); 				//100 : 만기일시상환
		bond.put("intPayMthd"	, "200"); 				//200 : 이표채
		bond.put("faceRate"		, "0.0225"); 
		bond.put("intPayTycd"	, "200"); 				//300 : 후급
		bond.put("intPayCycl"	, "6");
		bond.put("dayCntMthcd"	, "400");				//400 : ACT/365
		bond.put(""				, "500");				//500 : MF(Modified Following)
		bond.put("bfIntPayDate"	, "20191210");
		bond.put("afIntPayDate"	, "20200610");
		
		return bond;
	}
	
	/*채권 거래 정보*/
	public Map trdIfno()
	{
		Map<String, Object> bond = new HashMap<String, Object>(); 
		
		bond.put("trdId"		, "BOND20120101");
		bond.put("trdDate"		, "20200102");
		
		return bond;
	}
	
	/*채권 Cashflow 테이블 정보*/
	public Map cfInfo()
	{
		Map<String, Object> bond = new HashMap<String, Object>(); 
		
		bond.put("trdId"		, "BOND20120101");
		bond.put("trdDate"		, "20200102");
		
		return bond;
	}
}
