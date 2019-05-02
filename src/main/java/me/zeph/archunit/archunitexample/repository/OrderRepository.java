package me.zeph.archunit.archunitexample.repository;

import me.zeph.archunit.archunitexample.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

  public Order findById(long id) {
    return new Order(id);
  }
}
