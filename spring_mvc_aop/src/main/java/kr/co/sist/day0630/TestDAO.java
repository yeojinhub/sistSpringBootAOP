package kr.co.sist.day0630;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {

	private Map<String, String> map;
	
	public TestDAO() {
		map = new HashMap<String, String>();
		map.put("kim", "김민경");
		map.put("lee", "이여진");
		map.put("jang", "장태규");
	} //TestDAO
	
	public String selectName(String id) {
		System.out.println("[DAO] : selectName ");
		String name="";
		
		if(map.containsKey(id)) {
			name = map.get(id);
		} //end if
		
		return name;
	} //selectName
	
} //class
