package com.kb.lims.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kb.lims.dto.TicketDTO;
import com.kb.lims.entity.Ticket;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TicketMapper extends BaseMapper<Ticket> {

    @Update("update ticket set initiator = #{ticketDTO.initiator}, receiver = #{ticketDTO.receiver}, " +
            "bench_id = #{ticketDTO.benchId}, start_date = #{ticketDTO.startDate}, end_date = #{ticketDTO.endDate}, " +
            "state = #{ticketDTO.state} where id = #{id}")
    void updateById(@Param("id") int id, @Param("ticketDTO") TicketDTO ticketDTO);

    @Select("select * from ticket t where t.initiator = (select u.name from user u where u.id = #{id})")
    List<Ticket> selectInitiatorTickets(int id);

    @Select("select * from ticket t where t.receiver = (select u.name from user u where u.id = #{id})")
    List<Ticket> selectReceiverTickets(int id);

    @Select("select * from ticket t where t.auditor = (select u.name from user u where u.id = #{id})")
    List<Ticket> selectAuditorTickets(int id);
}
