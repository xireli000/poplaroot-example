package poplaroot.communication.example.service2.DualPlugExample.demonstration3.demo.entty;

import io.protostuff.Tag;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/9/11 21:31
 */
@Data
public class ServiceRpcExtend {

    @Tag(1)
    private String id;
    @Tag(2)
    private String name;
    @Tag(3)
    private List<ServiceUser> list;
    @Tag(4)
    private Map<String, ServiceUser> map;
}
