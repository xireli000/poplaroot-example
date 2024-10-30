package poplaroot.communication.example.service.spring1.DualPlugExample.demonstration1.PRConsumer;

import com.tunjix.poplaroot.communication.api.annotations.PRConsumer;
import com.tunjix.poplaroot.communication.api.annotations.RpcMethod;
import org.springframework.stereotype.Component;
import poplaroot.communication.example.service.spring1.DualPlugExample.demonstration1.entty.*;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 13:24
 */
@PRConsumer(appName = "Communication-Example-Service",serviceName = "/communicationExampleService")
@Component
public interface MyPRConsumer {
    /**
     * 获取Poplaroot Communication字符串
     * @return
     */
    @RpcMethod(name = "/getPoplarootStr")
    String getPoplarootStr();
    /**
     * 计算两个数字之和
     * @param a
     * @param b
     * @return
     */
    @RpcMethod(name = "/compute")
    Integer compute(Integer a,Integer b);
    /**
     * 传递和返回复杂的数据结构
     * @param id
     * @param serviceRpcExtend
     * @return
     */
    @RpcMethod(name = "/getServiceServiceRpcExtend")
    ConsumerResponseDTO getServiceServiceRpcExtend(String id, ConsumerRpcExtend serviceRpcExtend);
    /**
     * 传递和返回复杂的数据结构 （泛型版本）
     * @param id
     * @param serviceUser
     * @return
     */
    @RpcMethod(name = "/getServiceUserMsg")
    ConsumerResponseUniversalDTO<ConsumerRpcExtend> getServiceUserMsg(String id, ConsumerUser serviceUser);
}
