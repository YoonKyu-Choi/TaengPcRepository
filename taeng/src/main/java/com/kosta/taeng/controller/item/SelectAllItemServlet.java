package com.kosta.taeng.controller.item;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.taeng.service.ItemService;
import com.kosta.taeng.service.impl.ItemServiceImpl;
import com.kosta.taeng.vo.Item;

/**
 * Servlet implementation class SelectAllItemServlet
 */
@WebServlet("/item/selectAllItem")
public class SelectAllItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ItemService service = ItemServiceImpl.getInstance();
		Item item = new Item();
		
		List<Item> list = service.getItemList();
		request.setAttribute("itemList", list);
		request.getRequestDispatcher("/item_list.jsp").forward(request, response);
	}

}
