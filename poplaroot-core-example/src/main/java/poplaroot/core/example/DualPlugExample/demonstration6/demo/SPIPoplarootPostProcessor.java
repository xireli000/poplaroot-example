package poplaroot.core.example.DualPlugExample.demonstration6.demo;

import com.tunjix.poplaroot.api.annotations.Order;
import com.tunjix.poplaroot.api.core.DualPlugSPIRunPostProcessor;
import com.tunjix.poplaroot.api.core.DualPlugSPIRunPreProcessor;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/24 12:54
 */
@Order(1)
public class SPIPoplarootPostProcessor implements DualPlugSPIRunPostProcessor {
    @Override
    public void runPostProcessor() {
        System.out.println("poplaroot spi 后置处理器 SPIPoplarootPostProcessor");
    }
}
