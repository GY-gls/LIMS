package com.kb.lims.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kb.lims.dto.Result;
import com.kb.lims.dto.TicketDTO;
import com.kb.lims.entity.Code;
import com.kb.lims.entity.Ticket;
import com.kb.lims.mapper.TicketMapper;
import com.kb.lims.service.TicketService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class TicketServiceImpl extends ServiceImpl<TicketMapper, Ticket> implements TicketService {

    @Autowired
    private TicketMapper ticketMapper;

    /**
     * 获取所有需求单信息
     *
     * @return
     */
    @Override
    public Result getAllTickets() {
        List<Ticket> ticketList = ticketMapper.selectList(null);
        if(ticketList.isEmpty()) return Result.error(Code.EMPTY_LIST, "需求单信息为空");
        return Result.success(ticketList);
    }

    /**
     * 根据id获取需求单信息
     *
     * @param id
     * @return
     */
    @Override
    public Result getTicket(int id) {
        Ticket ticket = ticketMapper.selectById(id);
        return Result.success(ticket);
    }

    /**
     * 添加需求单
     *
     * @param ticketDTO
     * @return
     */
    @Override
    public Result addTicket(TicketDTO ticketDTO) {
        Result result = validateTicketInfo(ticketDTO);
        if(result.isSuccess()){
            Ticket ticket = new Ticket();
            BeanUtils.copyProperties(ticketDTO, ticket);
            ticket.setRequestDate(new Timestamp(System.currentTimeMillis()));
            ticketMapper.insert(ticket);
        }
        return result;
    }

    /**
     * 根据id修改需求单信息
     *
     * @param id
     * @param ticketDTO
     * @return
     */
    @Override
    public Result updateTicket(int id, TicketDTO ticketDTO) {
        Result result = validateTicketInfo(ticketDTO);
        if(result.isSuccess()) ticketMapper.updateById(id, ticketDTO);
        return result;
    }

    /**
     * 根据id删除需求单
     *
     * @param id
     * @return
     */
    @Override
    public Result deleteTicket(int id) {
       ticketMapper.deleteById(id);
       return Result.success(null);
    }

    /**
     * 根据发起人id查询相关需求单
     * @param id
     * @return
     */
    @Override
    public Result getInitiatorTickets(int id) {
        List<Ticket> ticketList = ticketMapper.selectInitiatorTickets(id);
        return Result.success(ticketList);
    }

    /**
     * 根据对接人id查询相关需求单
     *
     * @param id
     * @return
     */
    @Override
    public Result getReceiverTickets(int id) {
        List<Ticket> ticketList = ticketMapper.selectReceiverTickets(id);
        return Result.success(ticketList);
    }

    /**
     * 根据审核人id查询相关需求单
     *
     * @param id
     * @return
     */
    @Override
    public Result getAuditorTickets(int id) {
        List<Ticket> ticketList = ticketMapper.selectAuditorTickets(id);
        return Result.success(ticketList);
    }

    private Result validateTicketInfo(TicketDTO ticketDTO){
        if(ticketDTO.getInitiator().isEmpty()) return Result.error(Code.EMPTY_NAME, "发起人名称为空");
        if(ticketDTO.getReceiver().isEmpty()) return Result.error(Code.EMPTY_NAME, "对接人名称为空");
        return Result.success(null);
    }
}
