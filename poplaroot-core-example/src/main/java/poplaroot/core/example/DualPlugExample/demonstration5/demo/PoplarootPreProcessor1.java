package poplaroot.core.example.DualPlugExample.demonstration5.demo;

import com.tunjix.poplaroot.api.annotations.Order;
import com.tunjix.poplaroot.api.core.DualPlugRunPreProcessor;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/24 12:54
 */
@Order(1)
public class PoplarootPreProcessor1 implements DualPlugRunPreProcessor {
    @Override
    public void runPreProcessor() {
        System.out.println("poplaroot 前置处理器 PoplarootPreProcessor1");
    }
}
