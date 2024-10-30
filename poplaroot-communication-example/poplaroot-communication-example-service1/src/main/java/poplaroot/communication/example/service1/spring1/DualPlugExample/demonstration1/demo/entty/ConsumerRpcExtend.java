package poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1.demo.entty;

import io.protostuff.Tag;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/9/11 21:31
 */
@Data
public class ConsumerRpcExtend {

    @Tag(1)
    private String id;
    @Tag(2)
    private String name;
    @Tag(3)
    private List<ConsumerUser> list;
    @Tag(4)
    private Map<String, ConsumerUser> map;
}
