package poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1.demo.handler;

import com.tunjix.poplaroot.api.annotations.Order;
import com.tunjix.poplaroot.communication.api.core.handler.ConsumerPostExecutionHandler;
import com.tunjix.poplaroot.communication.common.rpc.RpcMessage;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 16:45
 */
@Order(1)
public class ConsumerRPCHandler implements ConsumerPostExecutionHandler {
    @Override
    public boolean clientPreHandler(RpcMessage rpcMessage, Object args) {
        System.out.println("客户端请求前置处理器");
        return true;
    }
}
