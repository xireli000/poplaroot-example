package poplaroot.core.example.DualPlugExample.demonstration3;

import com.tunjix.poplaroot.core.PoplarRoot;
import poplaroot.core.example.DualPlugExample.demonstration3.demo.TestUtil;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/21 23:50
 */
public class Main {
    public static void main(String[] args) {
        PoplarRoot.run();//启动PoplarRoot
        demonstration();
    }

    public static void demonstration(){
        String response1 = TestUtil.test01();
        System.out.println(response1);
        String response2 = new TestUtil().test02();
        System.out.println(response2);
    }
}
