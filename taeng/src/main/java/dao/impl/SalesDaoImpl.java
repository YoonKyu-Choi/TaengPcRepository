package dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.SalesDao;
import vo.Sales;

public class SalesDaoImpl implements SalesDao{

	@Override
	public int insertSales(SqlSession session, Sales sales) {
		return 0;
	}

	@Override
	public List<Sales> selectAllPcSales(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sales> selectAllItemSales(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectAllSales(SqlSession session) {
		// TODO Auto-generated method stub
		return 0;
	}
}
