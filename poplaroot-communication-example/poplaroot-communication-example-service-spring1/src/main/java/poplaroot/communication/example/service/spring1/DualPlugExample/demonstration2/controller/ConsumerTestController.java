package poplaroot.communication.example.service.spring1.DualPlugExample.demonstration2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poplaroot.communication.example.service.spring1.DualPlugExample.demonstration2.PRConsumer.MyPRConsumer;
import poplaroot.communication.example.service.spring1.DualPlugExample.demonstration2.PRConsumer.MyPRConsumerToo;

import javax.annotation.Resource;

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

    @GetMapping("/getStr")
    public String getStr(){
        return myPRConsumer.getPoplarootStr();
    }

    @GetMapping("/getStrToo")
    public String getStrToo(){
        return myPRConsumerToo.getStr();
    }

}
