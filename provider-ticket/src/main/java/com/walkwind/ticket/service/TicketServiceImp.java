package com.walkwind.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-27-22:38
 **/
@Service        //发布服务到注册中心
public class TicketServiceImp implements TicketService {

    @Override
    public String getTicket() {
        return "dubbo---测试provider-user的功能";
    }
}
