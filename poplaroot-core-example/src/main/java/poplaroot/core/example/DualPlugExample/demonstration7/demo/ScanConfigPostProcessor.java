package poplaroot.core.example.DualPlugExample.demonstration7.demo;

import com.tunjix.poplaroot.api.annotations.Order;
import com.tunjix.poplaroot.api.core.DualPlugScanConfig;
import com.tunjix.poplaroot.api.core.DualPlugScanConfigPostProcessor;
import org.apache.commons.lang3.StringUtils;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/24 16:12
 */
@Order(value = 1)
public class ScanConfigPostProcessor implements DualPlugScanConfigPostProcessor {
    @Override
    public void scanConfigPostProcessor(DualPlugScanConfig dualPlugScanConfig) {
        dualPlugScanConfig.setScanClasses(new Class[]{StringUtils.class});
    }
}
