package poplaroot.core.example.DualPlugExample.demonstration1.demo;
import com.tunjix.poplaroot.api.core.PlugDefinitionInfo;
import com.tunjix.poplaroot.api.core.aspectEnhancer.AspectEnhancerManager;

import java.lang.reflect.Method;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/22 00:08
 */
public class Enhance implements AspectEnhancerManager {
    @Override
    public void methodBeforeInvoke(PlugDefinitionInfo target, Method method, Object[] args) {
        System.out.println(target.getClassName()+"#"+method.getName()+"methodBeforeInvoke");
    }

    @Override
    public void methodAfterInvoke(PlugDefinitionInfo target, Method method, Object returnValue, Throwable throwable) {
        System.out.println(target.getClassName()+"#"+method.getName()+"methodAfterInvoke");
    }
}
