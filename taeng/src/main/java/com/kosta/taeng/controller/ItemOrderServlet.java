package com.kosta.taeng.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.taeng.service.ItemService;
import com.kosta.taeng.service.SalesService;
import com.kosta.taeng.service.impl.ItemServiceImpl;
import com.kosta.taeng.service.impl.SalesServiceImpl;
import com.kosta.taeng.vo.Item;

/**
 * Servlet implementation class ItemOrderServlet
 */
@WebServlet("/ItemOrderServlet")
public class ItemOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 매출 계산해서 table에 넣어주는 과정.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itemName = request.getParameter("itemName");
		String itemStock = request.getParameter("itemStock");
		SalesService salesService = SalesServiceImpl.getInstance();
		ItemService itemService = ItemServiceImpl.getInstance();
		
		Item item = itemService.findItemByName(itemName);
		salesService.doSales(new Date(), 0, item.getItemPrice()*(Integer.parseInt(itemStock)));
		request.getRequestDispatcher("");
		request.getSession().invalidate();
		
		
	}
}