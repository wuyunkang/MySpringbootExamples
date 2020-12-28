package com.wu.mysql.lock.controller;


import com.wu.mysql.lock.service.ILockService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wu
 * @since 2020-12-25
 */
@RestController
@RequestMapping("/lock")
public class LockController {
    @Resource
    private ILockService lockService;

    @ApiOperation("/测试乐观锁")
    @GetMapping("/lock1")
    public void TestOptimisticLock(){
//        lockService.TestInsert();
        lockService.TestUpdate();
    }

    @ApiOperation("/测试新增")
    @GetMapping("/lock2")
    public void TestInsert(){
//        lockService.TestInsert();
        lockService.TestInsert();
    }
}
