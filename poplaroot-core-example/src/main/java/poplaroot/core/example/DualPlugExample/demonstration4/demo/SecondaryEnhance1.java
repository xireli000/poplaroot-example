package poplaroot.core.example.DualPlugExample.demonstration4.demo;

import com.tunjix.poplaroot.api.annotations.Order;
import com.tunjix.poplaroot.api.annotations.SecondaryAspectEnhancer;
import com.tunjix.poplaroot.api.core.MethodInfo;
import com.tunjix.poplaroot.api.core.PlugDefinitionInfo;
import com.tunjix.poplaroot.api.core.aspectEnhancer.SecondaryAspectEnhancerManager;
import com.tunjix.poplaroot.api.entty.CircuitBreakerInfo;
import com.tunjix.poplaroot.api.util.DualPlugMethodUtil;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/24 00:01
 */
@Order(value = 1)
@SecondaryAspectEnhancer(aspectClasses = {StringUtils.class})
public class SecondaryEnhance1 implements SecondaryAspectEnhancerManager {

    // DualPlugMethodUtil.getMethodSeparator 方法
    // 第一个参数 入参类型 第二个参数 返回值
    // 重载方法用方法签名来判断比较正确（推荐使用）
    private static String upperCaseMethodDescriptor =
            DualPlugMethodUtil.getMethodSeparator(new Class[]{String.class},String.class);

    @Override
    public boolean filterMethod(Class<?> clazz, MethodInfo methodInfo) {
        //选择org.apache.commons.lang3.StringUtils.upperCase(java.lang.String) 方法
        if(methodInfo.getMethodName().equals("upperCase") &&
                methodInfo.getMethodDescriptor().equals(upperCaseMethodDescriptor)){
            return true;
        }
        return false;
    }

    @Override
    public void methodBeforeInvoke(PlugDefinitionInfo target, Method method, Object[] args) {
        System.out.println("准备执行:"+"--SecondaryEnhance1--methodBeforeInvoke");
    }

    @Override
    public CircuitBreakerInfo aspectCircuitBreaker(Object[] args, String methodName, String methodDescriptor, boolean isVoid, PlugDefinitionInfo target) {
        System.out.println("SecondaryEnhance1--参数："+args[0]);
        return new CircuitBreakerInfo(true);
    }

    @Override
    public void methodAfterInvoke(PlugDefinitionInfo target, Method method, Object returnValue, Throwable throwable) {
        if (throwable != null) {
            System.out.println("SecondaryEnhance1--"+method.getName()+"方法执行出现异常：" + throwable.getMessage());
        } else {
            System.out.println("SecondaryEnhance1--"+method.getName()+"方法执行完毕，返回值：" + returnValue);
        }
    }
}
