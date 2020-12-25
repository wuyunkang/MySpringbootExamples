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

}
