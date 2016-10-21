package com.aether.service;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yiba.rabbitmq.rpc.client.RpcRemoteClient;
import yiba.rabbitmq.rpc.iface.demo.dto.DemoDto;
import yiba.rabbitmq.rpc.iface.demo.response.DemoResponseDto;
import yiba.rabbitmq.rpc.iface.demo.service.DemoServiceImpl;

import com.aether.response.BaseMessage;
import com.aether.response.MessageCode;

/**
 *  监听队列demo
 * @author liuyang 　
 * * @date 创建时间：2016年9月29日 上午9:51:33
 *
 */
@Service
public class DemoService implements InitializingBean {

    @Autowired
    private ConnectionFactory rabbitConnectionFactory;

    private DemoServiceImpl demoServiceImpl;

    public void afterPropertiesSet() throws Exception {
        demoServiceImpl = (DemoServiceImpl) RpcRemoteClient.getBean(
                DemoServiceImpl.class, rabbitConnectionFactory);
    }

    /**
     * 测试RabbitMq
     * 
     * @return
     */
    public BaseMessage findAll() {
        DemoDto demoDto = new DemoDto();
        demoDto.setAge("11");
        demoDto.setName("liuyang");
        BaseMessage message = new BaseMessage(MessageCode.SUCCESSED);
        DemoResponseDto demoResponseDto = demoServiceImpl.findAll(demoDto);
        message.setData(demoResponseDto);
        message.setMsg("获取当前用户成功");
        return message;
    }

}
