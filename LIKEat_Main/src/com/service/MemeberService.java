package com.service;

import org.apache.ibatis.session.SqlSession;

import com.dao.MySqlSessionFactory;
import com.entity.MemberDTO;

public class MemeberService {
	
	String namespace = "com.acorn.MemberMapper.";
	
	public void join(MemberDTO dto) {
		SqlSession session = MySqlSessionFactory.openMySession();
		try{
			session.insert(namespace + "join", dto);
			session.commit();
		} finally {
			session.close();
		}		
	}//join
	
	
	

}
