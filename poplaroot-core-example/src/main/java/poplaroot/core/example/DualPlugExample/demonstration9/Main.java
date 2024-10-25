package poplaroot.core.example.DualPlugExample.demonstration9;

import com.tunjix.poplaroot.api.core.proxy.DualPlugProxyInfo;
import com.tunjix.poplaroot.core.PoplarRoot;
import com.tunjix.poplaroot.core.dualplug.annotations.PoplarRootApplication;
import com.tunjix.poplaroot.core.dualplug.proxy.PoplarootProxy;
import com.tunjix.poplaroot.dynamic.specifications.ProxyInterceptor;
import poplaroot.core.example.DualPlugExample.demonstration9.demo.Example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/21 23:50
 */
@PoplarRootApplication
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        PoplarRoot.run();//启动PoplarRoot
        demonstration();
    }

    public static void demonstration() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        //构造函数参数类型
        Class<?>[] constructorParameterTypes = new Class[]{String.class};
        //构造方法参数
        Object[] constructorArgs = new Object[]{"Poplaroot"};
        //不拦截方法
        DualPlugProxyInfo<Example> proxy = PoplarootProxy.getPoplarootProxy().getProxy(Example.class, constructorParameterTypes,constructorArgs, new ProxyInterceptor() {
            @Override
            public Object interceptor(Object thisProxy, Class<?> supperClass, Method method, Object[] allArguments, Callable<?> callable) {
                if(method.getName().equals("getPoplarootStr")){
                    System.out.println("动态代理:"+method.getName());
                }
                try {
                    return callable.call();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        String poplarootStr = proxy.getProxy().getPoplarootStr();
        System.out.println(poplarootStr);
    }
}
