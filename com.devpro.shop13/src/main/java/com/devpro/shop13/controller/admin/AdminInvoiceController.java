package com.devpro.shop13.controller.admin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devpro.shop13.controller.user.BaseController;
import com.devpro.shop13.services.SaleOrderService;
@Controller
public class AdminInvoiceController extends BaseController {
	
	@Autowired
	private SaleOrderService saleOrderService;
	@RequestMapping(value= {"/invoice"}, method=RequestMethod.GET)
    public String invoice(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) throws IOException
    {
      return"admin/invoice";

    }
	@RequestMapping(value = { "/admin/list-bills" }, method = RequestMethod.GET)
	public String listUsers(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		model.addAttribute("bills", saleOrderService.findAll());
		return "admin/list-bills";
	}
}
