package poplaroot.core.example.DualPlugExample.demonstration8;

import com.tunjix.poplaroot.api.core.proxy.DualPlugProxyInfo;
import com.tunjix.poplaroot.core.PoplarRoot;
import com.tunjix.poplaroot.core.dualplug.annotations.PoplarRootApplication;
import com.tunjix.poplaroot.core.dualplug.proxy.PoplarootProxy;
import poplaroot.core.example.DualPlugExample.demonstration8.demo.Example;

import java.lang.reflect.InvocationTargetException;

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

        //没有阻拦方法执行
        DualPlugProxyInfo<Example> proxy = PoplarootProxy.getPoplarootProxy().getProxy(Example.class, (thisProxy, supperClass, method, allArguments, callable) -> {
            System.out.println("动态代理:"+method.getName());
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        String poplarootStr = proxy.getProxy().getPoplarootStr();
        System.out.println(poplarootStr);

        System.out.println("---------------------------");

        DualPlugProxyInfo<Example> proxyToo = PoplarootProxy.getPoplarootProxy().getProxy(Example.class, (thisProxy, supperClass, method, allArguments, callable) -> {
            System.out.println("动态代理:"+method.getName());
            return "Poplaroot Test";
        });

        String poplarootStrTest = proxyToo.getProxy().getPoplarootStr();
        System.out.println(poplarootStrTest);
    }
}
