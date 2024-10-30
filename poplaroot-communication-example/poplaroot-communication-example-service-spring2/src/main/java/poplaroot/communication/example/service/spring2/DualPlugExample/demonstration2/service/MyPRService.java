package poplaroot.communication.example.service.spring2.DualPlugExample.demonstration2.service;

import com.tunjix.poplaroot.communication.api.annotations.PRService;
import com.tunjix.poplaroot.communication.api.annotations.RpcMethod;
import org.springframework.stereotype.Component;

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
}
