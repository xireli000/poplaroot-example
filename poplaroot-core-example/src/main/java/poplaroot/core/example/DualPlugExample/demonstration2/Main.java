package poplaroot.core.example.DualPlugExample.demonstration2;

import com.tunjix.poplaroot.core.PoplarRoot;
import com.tunjix.poplaroot.core.dualplug.annotations.PoplarRootApplication;
import poplaroot.core.example.DualPlugExample.demonstration1.demo.TestUtil;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/21 23:50
 */
@PoplarRootApplication(scanBasePackages = "poplaroot.core.example.DualPlugExample.demonstration1")
public class Main {
    public static void main(String[] args) {
        PoplarRoot.run();//启动PoplarRoot
        demonstration();
    }

    public static void demonstration(){
        TestUtil.test01();
    }
}
