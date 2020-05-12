package cn.com.djin.ssm.controller;

import cn.com.djin.ssm.entity.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *   订单控制器
 */
@Controller
@RequestMapping("/orders")
public class OrdersController extends BaseController<Orders> {
}
