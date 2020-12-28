package com.wu.mysql.lock.service.impl;

import com.wu.mysql.lock.entity.Lock;
import com.wu.mysql.lock.mapper.LockMapper;
import com.wu.mysql.lock.service.ILockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wu
 * @since 2020-12-25
 */
@Service
public class LockServiceImpl extends ServiceImpl<LockMapper, Lock> implements ILockService {

    @Override
    public void TestInsert() {
        Lock lock =Lock.builder()
                .id(3)
                .name("1")
                .version(1)
                .build();
        this.baseMapper.insert(lock);
    }

    @Override
    public void TestUpdate() {
        Lock lock = this.baseMapper.selectById(1);
        lock.setName("2");
        this.baseMapper.updateById(lock);
    }
}
