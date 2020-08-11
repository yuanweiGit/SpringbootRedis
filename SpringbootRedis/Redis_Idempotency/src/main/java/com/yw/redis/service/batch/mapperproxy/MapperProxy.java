package com.yw.redis.service.batch.mapperproxy;

import com.google.common.collect.Lists;
import com.yw.redis.service.batch.BatchProcessMapper;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import static com.yw.redis.common.Constant.MAX_SIZE_PER_TIME;

public class MapperProxy<T> implements BatchProcessMapper<T> {

    private BatchProcessMapper batchProcessMapper;

    public MapperProxy(BatchProcessMapper batchProcessMapper) {
        this.batchProcessMapper = batchProcessMapper;
    }

    @Override
    public void batchInsert(List<T> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }

        List<List<T>> partition = Lists.partition(list, MAX_SIZE_PER_TIME);
        for (List<T> batchList : partition) {
            batchProcessMapper.batchInsert(batchList);
        }
    }

    @Override
    public void batchUpdate(List<T> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }

        List<List<T>> partition = Lists.partition(list, MAX_SIZE_PER_TIME);
        for (List<T> batchList : partition) {
            batchProcessMapper.batchUpdate(batchList);
        }
    }

}
