package com.kgprojects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kgprojects.entity.Customer;
import com.kgprojects.service.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerController
{
	@Autowired
	public CustomerService customerService;
	//redirect
	@GetMapping("/")
	public String listPage()
	{
		return "redirect:/list";
	}
	//create
	@PostMapping("/create")
	public String createData(@ModelAttribute("customer") Customer customer)
	{
		customerService.create(customer);
		return "redirect:/list";
	}
	@GetMapping("/create-form")
	public String createData(Model model)
	{
		model.addAttribute("customer",new Customer());
		model.addAttribute("form_action", "create");
		model.addAttribute("action_btn", "Add Customer");
		return "customer-form";
	}
	//read
	@GetMapping("/list")
	public String readAllData(Model model)
	{
		model.addAttribute("customers_list",customerService.fetchRows());
		return "list-customers";
	}
	//update
	@PostMapping("/update")
	public String updateData(@ModelAttribute("customer") Customer customer)
	{
		customerService.update(customer);
		return "redirect:/list";
	}
	
	@GetMapping("/update-form")
	public String updateData(@RequestParam("id") int id, Model model)
	{
		model.addAttribute("customer",customerService.fetchRow(id));
		model.addAttribute("form_action", "update");
		model.addAttribute("action_btn", "Update Customer");
		return "customer-form";
	}
	//delete
	@GetMapping("/delete")
	public String deleteData(@RequestParam("id") int id)
	{
		customerService.delete(id);
		return "redirect:/list";
	}
	public CustomerService getCustomerService() {
		return customerService;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
}
