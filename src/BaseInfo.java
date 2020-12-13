import java.util.HashMap;
import java.util.Map;

public class BaseInfo {
	
	/*ä�� ���� ����*/
	public Map issueIfno()
	{
		Map<String, Object> bond = new HashMap<String, Object>(); 
		
		bond.put("itemCd"		, "");
		bond.put("itemName"		, "");
		bond.put("issDate"		, "");
		bond.put("matDate"		, "");
		bond.put("issAmt"		, "94690000000000");
		bond.put("issBalAmt"	, "69950000000000");
		bond.put("matReMthd"	, "100"); 				//100 : �����Ͻû�ȯ
		bond.put("intPayMthd"	, "200"); 				//200 : ��ǥä
		bond.put("faceRate"		, "0.0225"); 
		bond.put("intPayTycd"	, "200"); 				//300 : �ı�
		bond.put("intPayCycl"	, "6");
		bond.put("dayCntMthcd"	, "400");				//400 : ACT/365
		bond.put(""				, "500");				//500 : MF(Modified Following)
		bond.put("bfIntPayDate"	, "20191210");
		bond.put("afIntPayDate"	, "20200610");
		
		return bond;
	}
	
	/*ä�� �ŷ� ����*/
	public Map trdIfno()
	{
		Map<String, Object> bond = new HashMap<String, Object>(); 
		
		bond.put("trdId"		, "BOND20120101");
		bond.put("trdDate"		, "20200102");
		
		return bond;
	}
	
	/*ä�� Cashflow ���̺� ����*/
	public Map cfInfo()
	{
		Map<String, Object> bond = new HashMap<String, Object>(); 
		
		bond.put("trdId"		, "BOND20120101");
		bond.put("trdDate"		, "20200102");
		
		return bond;
	}
}
