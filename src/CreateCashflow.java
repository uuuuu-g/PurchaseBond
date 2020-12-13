import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateCashflow {
	
	public List<Map<String, Object>> createCf (Map cfInfo)
	{
		List cfList = new ArrayList();
		
		
		String issDate = cfInfo.get("").toString();				/* 발행일자 */
		String matDate = cfInfo.get("").toString();				/* 만기일자 */
		int issPayCylc = (int) cfInfo.get("intPayCycl");
		
	
		
		return cfList;
	}
}
