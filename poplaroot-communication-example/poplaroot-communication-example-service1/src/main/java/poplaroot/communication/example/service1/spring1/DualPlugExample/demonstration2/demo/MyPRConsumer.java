package poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration2.demo;

import com.tunjix.poplaroot.communication.api.annotations.PRConsumer;
import com.tunjix.poplaroot.communication.api.annotations.RpcMethod;
/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 13:24
 */
@PRConsumer(appName = "Communication-Example-Service",serviceName = "/communicationExampleService")
public interface MyPRConsumer {
    /**
     * 获取Poplaroot Communication字符串
     * @return
     */
    @RpcMethod(name = "/getPoplarootStr")
    String getPoplarootStr();
}
