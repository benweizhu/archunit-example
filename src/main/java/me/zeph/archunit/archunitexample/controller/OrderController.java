package me.zeph.archunit.archunitexample.controller;

import me.zeph.archunit.archunitexample.model.Order;
import me.zeph.archunit.archunitexample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class OrderController {

  @Autowired
  private OrderService orderService;

  @RequestMapping(value = "/orders/{id}", method = GET)
  public Order getOrderById(@PathVariable long id) {
    return orderService.getOrder(id);
  }
}
