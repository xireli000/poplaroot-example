package poplaroot.communication.example.service2.DualPlugExample.demonstration1.handler;

import com.tunjix.poplaroot.api.annotations.Order;
import com.tunjix.poplaroot.communication.api.core.handler.ServerPostExecutionHandler;
import com.tunjix.poplaroot.communication.common.rpc.RpcMessage;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 16:53
 */
@Order(1)
public class ServerRPCHandler implements ServerPostExecutionHandler {
    @Override
    public boolean serverPreHandler(RpcMessage rpcMessage, Object[] args) {
        return true;
    }
}
