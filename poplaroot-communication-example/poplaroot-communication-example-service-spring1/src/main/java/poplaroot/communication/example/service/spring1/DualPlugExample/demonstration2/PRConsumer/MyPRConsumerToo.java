package poplaroot.communication.example.service.spring1.DualPlugExample.demonstration2.PRConsumer;

import com.tunjix.poplaroot.communication.api.annotations.PRConsumer;
import com.tunjix.poplaroot.communication.api.annotations.RpcMethod;
import org.springframework.stereotype.Component;
/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 13:24
 */
@PRConsumer(appName = "Communication-Example-Service",serviceName = "/service")
@Component
public interface MyPRConsumerToo {
    /**
     * 获取Poplaroot Communication Spring Boot 字符串
     * @return
     */
    @RpcMethod(name = "/getStr")
    String getStr();
}
