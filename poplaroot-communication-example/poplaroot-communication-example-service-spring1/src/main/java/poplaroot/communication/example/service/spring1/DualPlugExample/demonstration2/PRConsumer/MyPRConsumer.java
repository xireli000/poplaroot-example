package poplaroot.communication.example.service.spring1.DualPlugExample.demonstration2.PRConsumer;

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
     * 传递和返回复杂的数据结构
     * @param id
     * @param serviceRpcExtend
     * @return
     */
    @RpcMethod(name = "/getServiceServiceRpcExtend")
    ConsumerResponseDTO getServiceServiceRpcExtend(String id, ConsumerRpcExtend serviceRpcExtend);
}
