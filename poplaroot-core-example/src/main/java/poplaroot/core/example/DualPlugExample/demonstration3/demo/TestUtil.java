package poplaroot.core.example.DualPlugExample.demonstration3.demo;

import com.tunjix.poplaroot.api.annotations.AspectEnhancer;
import com.tunjix.poplaroot.api.annotations.AspectEnhancerMethod;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/22 00:08
 */
@AspectEnhancer(aspectClasses = {Enhance.class})
public class TestUtil {
    @AspectEnhancerMethod
    public static String test01(){
        System.out.println("demonstration3.demo.TestUtil.test01");
        return "test01--ok";
    }

    @AspectEnhancerMethod
    public String test02(){
        System.out.println("demonstration3.demo.TestUtil.test02");
        return "test02--ok";
    }
}
