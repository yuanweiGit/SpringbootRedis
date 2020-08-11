package com.yw.redis.mapper;



import com.yw.redis.pojo.MsgLog;
import com.yw.redis.service.batch.BatchProcessMapper;

import java.util.List;

public interface MsgLogMapper extends BatchProcessMapper<MsgLog> {

    void insert(MsgLog msgLog);

    void updateStatus(MsgLog msgLog);

    List<MsgLog> selectTimeoutMsg();

    void updateTryCount(MsgLog msgLog);

    MsgLog selectByPrimaryKey(String msgId);

}
