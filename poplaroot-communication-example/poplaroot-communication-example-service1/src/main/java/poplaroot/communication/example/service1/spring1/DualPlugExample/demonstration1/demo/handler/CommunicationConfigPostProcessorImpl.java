package poplaroot.communication.example.service1.spring1.DualPlugExample.demonstration1.demo.handler;

import com.tunjix.poplaroot.communication.api.core.CommunicationConfigPostProcessor;
import com.tunjix.poplaroot.communication.api.core.ConfigManager;
import com.tunjix.poplaroot.communication.api.core.InitializationConfigManager;
import com.tunjix.poplaroot.communication.api.entty.start.StartConfig;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/30 00:21
 */
public class CommunicationConfigPostProcessorImpl implements CommunicationConfigPostProcessor {
    @Override
    public void postProcessor(ConfigManager ymlConfig, StartConfig startConfig, InitializationConfigManager initializationConfig) {
        System.out.println("配置后置处理器");
    }
}
