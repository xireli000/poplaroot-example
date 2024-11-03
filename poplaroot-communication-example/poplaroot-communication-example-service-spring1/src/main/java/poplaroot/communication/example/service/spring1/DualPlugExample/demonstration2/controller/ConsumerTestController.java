package poplaroot.communication.example.service.spring1.DualPlugExample.demonstration2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import poplaroot.communication.example.service.spring1.DualPlugExample.demonstration1.entty.*;
import poplaroot.communication.example.service.spring1.DualPlugExample.demonstration2.PRConsumer.MyPRConsumer;
import poplaroot.communication.example.service.spring1.DualPlugExample.demonstration2.PRConsumer.MyPRConsumerToo;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 14:23
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerTestController {

    @Resource
    private MyPRConsumer myPRConsumer;
    @Resource
    private MyPRConsumerToo myPRConsumerToo;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getStr")
    public String getStr(){
        return myPRConsumer.getPoplarootStr();
    }

    @GetMapping("/getStrToo")
    public String getStrToo(){
        return myPRConsumerToo.getStr();
    }

    @GetMapping("/compare")
    public String compare(){

        long startTime = System.currentTimeMillis();

        //Communication-Example-Service服务 --- 传递和返回复杂的数据结构
        ConsumerRpcExtend consumerRpcExtend = new ConsumerRpcExtend();
        consumerRpcExtend.setName("test communication");
        consumerRpcExtend.setList(new ArrayList<ConsumerUser>(){{add(new ConsumerUser("user1",18));}});
        consumerRpcExtend.setMap(new HashMap<String, ConsumerUser>(){{put("user2",new ConsumerUser("user2",28));}});
        ConsumerResponseDTO serviceServiceRpcExtend = myPRConsumer.getServiceServiceRpcExtend("6788", consumerRpcExtend);
        long endTime = System.currentTimeMillis();
        System.out.println("poplaroot:"+(endTime-startTime));


        String url = "http://127.0.0.1:9001/service/getServiceServiceRpcExtend";
        long l2 = System.currentTimeMillis();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<ConsumerRpcExtend> requestEntity = new HttpEntity<>(consumerRpcExtend, headers);
        ResponseEntity<ConsumerResponseDTO> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                ConsumerResponseDTO.class
        );

        System.out.println("spring:"+(System.currentTimeMillis()-l2));

        return "ok";
    }

}
