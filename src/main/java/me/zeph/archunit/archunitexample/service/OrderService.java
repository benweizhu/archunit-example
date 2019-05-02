package me.zeph.archunit.archunitexample.service;

import me.zeph.archunit.archunitexample.model.Order;
import me.zeph.archunit.archunitexample.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;

  public Order getOrder(long id) {
    return orderRepository.findById(id);
  }
}
