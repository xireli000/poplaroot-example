package poplaroot.communication.example.service.spring2.DualPlugExample.demonstration2.service;

import com.tunjix.poplaroot.communication.api.annotations.PRService;
import com.tunjix.poplaroot.communication.api.annotations.RpcMethod;
import org.springframework.stereotype.Component;
import poplaroot.communication.example.service.spring2.DualPlugExample.demonstration1.entty.ServiceResponseDTO;
import poplaroot.communication.example.service.spring2.DualPlugExample.demonstration1.entty.ServiceRpcExtend;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 13:04
 */
@PRService(serviceName = "/communicationExampleService")
@Component
public class MyPRService {
    /**
     * 获取Poplaroot Communication字符串
     * @return
     */
    @RpcMethod(name = "/getPoplarootStr")
    public String getPoplarootStr(){
        return "Poplaroot Communication";
    }


    /**
     * 传递和返回复杂的数据结构
     * @param id
     * @param serviceRpcExtend
     * @return
     */
    @RpcMethod(name = "/getServiceServiceRpcExtend")
    public ServiceResponseDTO getServiceServiceRpcExtend(String id, ServiceRpcExtend serviceRpcExtend){
        //构造数据结构
        serviceRpcExtend.setId(id);
        ServiceResponseDTO serviceResponseDTO = new ServiceResponseDTO();
        serviceResponseDTO.setConsumerRpcExtend(serviceRpcExtend);
        return serviceResponseDTO;
    }
}
