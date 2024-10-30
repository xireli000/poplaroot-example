package poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1;

import com.tunjix.poplaroot.communication.api.utils.RPCUtil;
import com.tunjix.poplaroot.core.PoplarRoot;
import com.tunjix.poplaroot.core.dualplug.annotations.PoplarRootApplication;
import poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1.demo.MyPRConsumer;
import poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1.demo.entty.ConsumerResponseDTO;
import poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1.demo.entty.ConsumerResponseUniversalDTO;
import poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1.demo.entty.ConsumerRpcExtend;
import poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1.demo.entty.ConsumerUser;

import java.util.ArrayList;
import java.util.HashMap;

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
        //Communication-Example-Service服务 --- 计算两个数字之和
        Integer compute = consumer.compute(2, 3);
        System.out.println("consumer.compute:"+compute);


        //Communication-Example-Service服务 --- 传递和返回复杂的数据结构
        ConsumerRpcExtend consumerRpcExtend = new ConsumerRpcExtend();
        consumerRpcExtend.setName("test communication");
        consumerRpcExtend.setList(new ArrayList<ConsumerUser>(){{add(new ConsumerUser("user1",18));}});
        consumerRpcExtend.setMap(new HashMap<String,ConsumerUser>(){{put("user2",new ConsumerUser("user2",28));}});
        ConsumerResponseDTO serviceRpcExtend = consumer.getServiceServiceRpcExtend("123456789", consumerRpcExtend);
        System.out.println(serviceRpcExtend.toString());

        //Communication-Example-Service服务 --- 传递和返回复杂的数据结构 （泛型版本）
        ConsumerUser user3 = new ConsumerUser("user3", 38);
        ConsumerResponseUniversalDTO<ConsumerRpcExtend> serviceUserMsg = consumer.getServiceUserMsg("123456789", user3);
        System.out.println(serviceUserMsg.toString());
    }
}
