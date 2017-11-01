package com.kosta.taeng.dao;

import org.apache.ibatis.session.SqlSession;

import com.kosta.taeng.vo.PC;

public interface PCDao {

	public int insertPC(SqlSession session, PC pc);
	
	public PC selectPCByNum(SqlSession session, int pcNum);
	
	public int updatePC(SqlSession session, PC pc);
}