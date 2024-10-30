package poplaroot.communication.example.service.spring2.DualPlugExample.demonstration1.service;

import com.tunjix.poplaroot.communication.api.annotations.PRService;
import com.tunjix.poplaroot.communication.api.annotations.RpcMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import poplaroot.communication.example.service.spring2.DualPlugExample.demonstration1.entty.*;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 13:04
 */
@PRService(serviceName = "/communicationExampleService")
@Component
public class MyPRService {
    @Autowired
    private TestService testService;
    /**
     * 获取Poplaroot Communication字符串
     * @return
     */
    @RpcMethod(name = "/getPoplarootStr")
    public String getPoplarootStr(){
        return testService.getPoplarootStr();
    }

    /**
     * 计算两个数字之和
     * @param a
     * @param b
     * @return
     */
    @RpcMethod(name = "/compute")
    public Integer compute(Integer a,Integer b){
        return a+b;
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

    /**
     * 传递和返回复杂的数据结构 （泛型版本）
     * @param id
     * @param serviceUser
     * @return
     */
    @RpcMethod(name = "/getServiceUserMsg")
    public ServiceResponseUniversalDTO<ServiceRpcExtend> getServiceUserMsg(String id, ServiceUser serviceUser){
        //构造数据结构
        ServiceResponseUniversalDTO<ServiceRpcExtend> serviceResponseUniversalDTO = new ServiceResponseUniversalDTO();
        ServiceRpcExtend serviceRpcExtend = new ServiceRpcExtend();
        Map<String, ServiceUser> map = new HashMap<>();
        map.put(id,serviceUser);
        serviceRpcExtend.setMap(map);
        serviceResponseUniversalDTO.setMyRpcExtend(serviceRpcExtend);
        return serviceResponseUniversalDTO;
    }
}
