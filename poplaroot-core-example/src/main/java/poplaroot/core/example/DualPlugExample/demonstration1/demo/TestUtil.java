package poplaroot.core.example.DualPlugExample.demonstration1.demo;

import com.tunjix.poplaroot.api.annotations.AspectEnhancer;
import com.tunjix.poplaroot.api.annotations.AspectEnhancerMethod;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/22 00:08
 */
@AspectEnhancer(AspectClasses = {MyTest.class})
public class TestUtil {
    @AspectEnhancerMethod
    public static String test01(){
        System.out.println("com.tunjix.poplaroot.core.example.DualPlugExample.demonstration1.demo.TestUtil.test01");
        return "ok";
    }
}
