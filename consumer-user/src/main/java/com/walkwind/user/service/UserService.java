package com.walkwind.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walkwind.ticket.service.TicketService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-27-23:16
 **/
@Service
public class UserService {
    @Reference
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println(ticket);
    }
}
