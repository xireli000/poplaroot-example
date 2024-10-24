package poplaroot.core.example.DualPlugExample.demonstration5.demo;

import com.tunjix.poplaroot.api.annotations.Order;
import com.tunjix.poplaroot.api.core.DualPlugSPIRunPreProcessor;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/24 12:54
 */
@Order(2)
public class SPIPoplarootPreProcessor2 implements DualPlugSPIRunPreProcessor {
    @Override
    public void runPreProcessor() {
        System.out.println("poplaroot spi 前置处理器 SPIPoplarootPreProcessor2");
    }
}
