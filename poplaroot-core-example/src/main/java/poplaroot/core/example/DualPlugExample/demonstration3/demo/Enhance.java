package poplaroot.core.example.DualPlugExample.demonstration3.demo;
import com.tunjix.poplaroot.api.annotations.Order;
import com.tunjix.poplaroot.api.core.PlugDefinitionInfo;
import com.tunjix.poplaroot.api.core.aspectEnhancer.AspectEnhancerManager;
import com.tunjix.poplaroot.api.entty.CircuitBreakerInfo;

import java.lang.reflect.Method;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/22 00:08
 */
@Order(value = 1)
public class Enhance implements AspectEnhancerManager {
    @Override
    public void methodBeforeInvoke(PlugDefinitionInfo target, Method method, Object[] args) {
        System.out.println("准备执行:"+target.getClassName()+"#"+method.getName()+"--methodBeforeInvoke");
    }

    @Override
    public CircuitBreakerInfo aspectCircuitBreaker(Object[] args, String methodName, String methodDescriptor, boolean isVoid, PlugDefinitionInfo target) {
        System.out.println(target.getClassName()+"#"+methodName+"--aspectCircuitBreaker");
        if(methodName.equals("test02")){
            return new CircuitBreakerInfo(false,"poplaroot");
        }
        return new CircuitBreakerInfo(true);
    }

    @Override
    public void methodAfterInvoke(PlugDefinitionInfo target, Method method, Object returnValue, Throwable throwable) {
        System.out.println(target.getClassName()+"#"+method.getName()+"--methodAfterInvoke");
        if (throwable != null) {
            System.out.println("方法执行出现异常：" + throwable.getMessage());
        } else {
            System.out.println("方法执行完毕，返回值：" + returnValue);
        }
    }
}
