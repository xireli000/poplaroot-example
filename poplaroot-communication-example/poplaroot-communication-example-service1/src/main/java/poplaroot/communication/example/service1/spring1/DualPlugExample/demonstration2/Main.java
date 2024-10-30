package poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration2;

import com.tunjix.poplaroot.communication.api.utils.RPCUtil;
import com.tunjix.poplaroot.core.PoplarRoot;
import com.tunjix.poplaroot.core.dualplug.annotations.PoplarRootApplication;
import poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration2.demo.MyPRConsumer;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/27 23:07
 */
@PoplarRootApplication
public class Main {

    public static void main(String[] args) {
        PoplarRoot.run();
        //获取消费者
        MyPRConsumer consumer = RPCUtil.getConsumer(MyPRConsumer.class);

        //Communication-Example-Service服务 --- 获取Poplaroot Communication字符串
        String poplarootStr = consumer.getPoplarootStr();
        System.out.println("consumer.getPoplarootStr:"+poplarootStr);
    }
}
