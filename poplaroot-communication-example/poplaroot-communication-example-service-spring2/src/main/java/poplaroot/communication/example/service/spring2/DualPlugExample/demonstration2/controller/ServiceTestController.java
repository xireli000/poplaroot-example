package poplaroot.communication.example.service.spring2.DualPlugExample.demonstration2.controller;

import com.tunjix.poplaroot.communication.api.annotations.PRService;
import com.tunjix.poplaroot.communication.api.annotations.RpcMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poplaroot.communication.example.service.spring2.DualPlugExample.demonstration1.entty.ServiceResponseDTO;
import poplaroot.communication.example.service.spring2.DualPlugExample.demonstration1.entty.ServiceRpcExtend;
import poplaroot.communication.example.service.spring2.DualPlugExample.demonstration2.service.MyPRService;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 14:12
 */
@RestController
@RequestMapping("/service")
@PRService(serviceName = "/service")
public class ServiceTestController {

    @Autowired
    private MyPRService myPRService;

    @GetMapping("/getStr")
    @RpcMethod(name = "/getStr")
    public String getStr(){
        return myPRService.getPoplarootStr()+" Spring Boot";
    }

    @PostMapping("/getServiceServiceRpcExtend")
    @RpcMethod(name = "/getStr2")
    public ServiceResponseDTO getServiceServiceRpcExtend(@RequestBody ServiceRpcExtend serviceRpcExtend){
        return myPRService.getServiceServiceRpcExtend("123",serviceRpcExtend);
    }
}
