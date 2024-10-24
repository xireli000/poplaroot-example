package poplaroot.core.example.DualPlugExample.demonstration4;

import com.tunjix.poplaroot.core.PoplarRoot;
import com.tunjix.poplaroot.core.dualplug.annotations.PoplarRootApplication;
import org.apache.commons.lang3.StringUtils;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/21 23:50
 */
@PoplarRootApplication(scanPackageClasses = {StringUtils.class})
public class Main {
    public static void main(String[] args) {
        PoplarRoot.run();//启动PoplarRoot
        demonstration();
    }

    public static void demonstration(){
        String response = StringUtils.upperCase("poplaroot");
        System.out.println("StringUtils.upperCase 返回结果："+response);
    }
}
