package com.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dao.AppleDao;
import com.po.MyApple;
@Controller
public class AppleController {
	@Autowired
	private AppleDao appleDao;
    @RequestMapping("/add")
    public String addApple(Model model, HttpServletRequest request) {
   
        String aplace = request.getParameter("aplace");
        String saweight = request.getParameter("aweight");
        String saprice = request.getParameter("aprice");
        float aweight=Float.parseFloat(saweight);
        float aprice=Float.parseFloat(saprice);
        MyApple adda = new MyApple();
		adda.setAplace(aplace);
		adda.setAweight(aweight);
		adda.setPrice(aprice);
        appleDao.addApple(adda);
        List<MyApple> list = appleDao.selectAllApple();
        model.addAttribute("appleList", list);
        return "appleList";
    }
}
