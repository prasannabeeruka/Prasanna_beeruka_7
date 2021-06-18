

package com.demo.example.service.administrator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.example.bean.RouteBean;
import com.demo.example.dao.administrator.RouteDao;


@Component
public class RouteService {
	@Autowired
	RouteDao dao;
	public String addRoute(RouteBean routebean){
		if(routebean==null)
			return "FAIL";
		else if(routebean.getRoute_id()==null){
			return "FAIL";
		}
			else
			{
				return dao.addRoute(routebean);
			}
		}

	public RouteBean ViewRoute(String route_id){

		return dao.ViewRoute(route_id);
	}

	public String ModifyRoute(RouteBean routebean){
		return dao.ModifyRoute(routebean);

	}
	public String ConfirmDeleteRoute(RouteBean routebean){

		return dao.ConfirmDeleteRoute(routebean);
	}
	public List<RouteBean> displayall()
	{
		return dao.displayall();
	}
}
